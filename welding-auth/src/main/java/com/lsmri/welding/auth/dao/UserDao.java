package com.lsmri.welding.auth.dao;

import com.lsmri.welding.model.Permission;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-10-11
 */
public interface UserDao {

    /**
     * 根据用户id查询拥有的权限列表
     *
     * @param userId 用户id
     * @return 权限列表
     */
    List<Permission> listPermissions(Long userId);

}
