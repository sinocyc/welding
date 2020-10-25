package com.lsmri.welding.portal.controller;

import com.lsmri.welding.auth.constant.AuthorityName;
import com.lsmri.welding.common.api.CommonPage;
import com.lsmri.welding.common.api.CommonResult;
import com.lsmri.welding.portal.dto.RolePermissionDTO;
import com.lsmri.welding.portal.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色控制器
 *
 * @author Cui Yicheng
 * @date 2020-10-25
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.ADMIN + "')")
    public CommonResult list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        List<RolePermissionDTO> list = roleService.listRoleWithPermissions(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
