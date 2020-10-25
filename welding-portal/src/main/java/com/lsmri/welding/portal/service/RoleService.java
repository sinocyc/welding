package com.lsmri.welding.portal.service;

import com.lsmri.welding.portal.dto.RolePermissionDTO;

import java.util.List;

/**
 * 角色服务接口
 *
 * @author Cui Yicheng
 * @date 2020-10-25
 */
public interface RoleService {

    /**
     * 分页查询角色，包含权限信息
     *
     * @param pageNum  页数
     * @param pageSize 每页条数
     * @return 角色列表
     */
    List<RolePermissionDTO> listRoleWithPermissions(Integer pageNum, Integer pageSize);

}
