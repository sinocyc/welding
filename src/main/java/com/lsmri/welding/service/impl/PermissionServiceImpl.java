package com.lsmri.welding.service.impl;

import com.lsmri.welding.entity.Permission;
import com.lsmri.welding.mapper.PermissionMapper;
import com.lsmri.welding.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getUserPermissions(Integer uid) {
        return permissionMapper.selectUserPermissions(uid);
    }
}
