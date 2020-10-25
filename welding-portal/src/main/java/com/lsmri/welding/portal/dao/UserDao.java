package com.lsmri.welding.portal.dao;

import com.lsmri.welding.model.PermissionDO;
import com.lsmri.welding.portal.dto.UserRoleDTO;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * 用户数据访问接口
 *
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

    /**
     * 批量查询用户信息，包含角色名列表
     *
     * @return 用户信息列表
     */
    @MapKey("id")
    Map<Long, UserRoleDTO> listUserWithRoles(List<Long> userIdList);

}
