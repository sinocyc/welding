package com.lsmri.welding.mapper;

import com.lsmri.welding.model.UserRoleRelationDO;
import com.lsmri.welding.model.UserRoleRelationDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRelationMapper {
    long countByExample(UserRoleRelationDOExample example);

    int deleteByExample(UserRoleRelationDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelationDO record);

    int insertSelective(UserRoleRelationDO record);

    List<UserRoleRelationDO> selectByExample(UserRoleRelationDOExample example);

    UserRoleRelationDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRoleRelationDO record, @Param("example") UserRoleRelationDOExample example);

    int updateByExample(@Param("record") UserRoleRelationDO record, @Param("example") UserRoleRelationDOExample example);

    int updateByPrimaryKeySelective(UserRoleRelationDO record);

    int updateByPrimaryKey(UserRoleRelationDO record);
}