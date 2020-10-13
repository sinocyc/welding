package com.lsmri.welding.mapper;

import com.lsmri.welding.model.RolePermissionRelationDO;
import com.lsmri.welding.model.RolePermissionRelationDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionRelationMapper {
    long countByExample(RolePermissionRelationDOExample example);

    int deleteByExample(RolePermissionRelationDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionRelationDO record);

    int insertSelective(RolePermissionRelationDO record);

    List<RolePermissionRelationDO> selectByExample(RolePermissionRelationDOExample example);

    RolePermissionRelationDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RolePermissionRelationDO record, @Param("example") RolePermissionRelationDOExample example);

    int updateByExample(@Param("record") RolePermissionRelationDO record, @Param("example") RolePermissionRelationDOExample example);

    int updateByPrimaryKeySelective(RolePermissionRelationDO record);

    int updateByPrimaryKey(RolePermissionRelationDO record);
}