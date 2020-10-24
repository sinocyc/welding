package com.lsmri.welding.portal.controller;

import com.lsmri.welding.common.api.CommonResult;
import com.lsmri.welding.portal.dto.UserInfoDTO;
import com.lsmri.welding.portal.dto.UserLoginQuery;
import com.lsmri.welding.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @author Cui Yicheng
 * @since 2020/9/29
 */

@Controller
@RequestMapping("/user")
public class UserController {

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
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUsername(authentication.getName());
        List<String> authorities = new ArrayList<>();
        authentication.getAuthorities().forEach(a -> authorities.add(a.getAuthority()));
        userInfoDTO.setAuthorities(authorities);
        return CommonResult.success(userInfoDTO);
    }

}
