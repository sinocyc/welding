package com.lsmri.welding.service;

import com.lsmri.welding.entity.Permission;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
public interface PermissionService {

    List<Permission> getUserPermissions(Integer uid);

}
