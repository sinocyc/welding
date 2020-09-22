package com.lsmri.welding.service;

import com.lsmri.welding.entity.Permission;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
public interface PermissionService {

    /**
     * 根据用户id查询用户拥有的权限
     *
     * @param uid 用户id
     * @return 用户拥有的权限的列表
     */
    List<Permission> getUserPermissions(Integer uid);

}
