package com.lsmri.welding.portal.controller;

import com.lsmri.welding.auth.constant.AuthorityName;
import com.lsmri.welding.common.api.CommonPage;
import com.lsmri.welding.common.api.CommonResult;
import com.lsmri.welding.portal.dto.*;
import com.lsmri.welding.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户控制器
 *
 * @author Cui Yicheng
 * @since 2020/9/29
 */

@Controller
@RequestMapping("/user")
public class UserController {

    public static final String ADMIN_USERNAME = "admin";
    public static final String DEFAULT_PASSWORD = "123456";

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@Validated @RequestBody UserLoginQuery userLoginQuery) {
        String token = userService.login(userLoginQuery.getUsername(), userLoginQuery.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult info(Authentication authentication) {
        // 用户已被删除的情况
        String username = authentication.getName();
        boolean exist = userService.usernameExist(username);
        if (!exist) {
            return CommonResult.unauthorized(null);
        }


        UserAuthorityDTO userAuthorityDTO = new UserAuthorityDTO();
        userAuthorityDTO.setUsername(username);
        List<String> authorities = new ArrayList<>();
        authentication.getAuthorities().forEach(a -> authorities.add(a.getAuthority()));
        userAuthorityDTO.setAuthorities(authorities);
        return CommonResult.success(userAuthorityDTO);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.ADMIN + "')")
    public CommonResult list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UserRoleDTO> list = userService.listUserWithRoles(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.ADMIN + "')")
    public CommonResult save(@Validated AddUserQuery addUserQuery) {
        String username = addUserQuery.getUsername();
        boolean exist = userService.usernameExist(username);
        if (exist) {
            return CommonResult.failed("用户名（" + username + "）已存在，请换个用户名。");
        }
        return userService.save(addUserQuery) > 0 ? CommonResult.success(null) : CommonResult.failed("新增用户失败。");
    }

    @RequestMapping(value = "/password", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult changePassword(@Validated ChangePasswordQuery changePasswordQuery) {
        boolean valid = userService.validatePassword(changePasswordQuery.getUsername(), changePasswordQuery.getOldPassword());
        if (!valid) {
            return CommonResult.failed("旧密码错误。");
        }
        return userService.changePassword(changePasswordQuery.getUsername(), changePasswordQuery.getNewPassword())
                ? CommonResult.success(null) : CommonResult.failed("修改密码失败。");
    }

    @RequestMapping(value = "/reset", method = RequestMethod.PUT)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.ADMIN + "')")
    public CommonResult resetPassword(@RequestParam(name = "username") String username) {
        return userService.changePassword(username, DEFAULT_PASSWORD)
                ? CommonResult.success(DEFAULT_PASSWORD) : CommonResult.failed("修改密码失败。");
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.ADMIN + "')")
    public CommonResult delete(@RequestParam(name = "username") String username) {
        if (ADMIN_USERNAME.equals(username)) {
            return CommonResult.failed("总管理员（admin）不能被删除。");
        }
        return userService.delete(username) ? CommonResult.success(null) : CommonResult.failed("删除用户失败。");
    }

}
