package com.lsmri.welding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsmri.welding.entity.Permission;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-09-20
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> selectUserPermissions(Integer uid);

}
