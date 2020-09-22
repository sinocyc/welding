package com.lsmri.welding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsmri.welding.entity.Permission;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     * 根据用户id查询用户拥有的权限
     *
     * @param uid 用户id
     * @return 用户拥有的权限的列表
     */
    List<Permission> selectUserPermissions(Integer uid);

}
