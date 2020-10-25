package com.lsmri.welding.portal.dao;

import com.lsmri.welding.portal.dto.RolePermissionDTO;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * 角色数据访问接口
 *
 * @author Cui Yicheng
 * @date 2020-10-25
 */
public interface RoleDao {

    /**
     * 批量查询角色信息，包括权限信息
     *
     * @return 角色信息
     */
    @MapKey("id")
    Map<Long, RolePermissionDTO> listRoleWithPermissions(List<Long> roleIdList);

}
