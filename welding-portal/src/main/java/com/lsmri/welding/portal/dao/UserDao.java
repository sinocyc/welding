package com.lsmri.welding.portal.dao;

import com.lsmri.welding.model.PermissionDO;

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
    List<PermissionDO> listPermissions(Long userId);

}
