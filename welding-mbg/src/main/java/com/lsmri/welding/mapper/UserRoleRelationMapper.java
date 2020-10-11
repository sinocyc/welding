package com.lsmri.welding.mapper;

import com.lsmri.welding.model.UserRoleRelation;
import com.lsmri.welding.model.UserRoleRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleRelationMapper {
    long countByExample(UserRoleRelationExample example);

    int deleteByExample(UserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelation record);

    int insertSelective(UserRoleRelation record);

    List<UserRoleRelation> selectByExample(UserRoleRelationExample example);

    UserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRoleRelation record, @Param("example") UserRoleRelationExample example);

    int updateByExample(@Param("record") UserRoleRelation record, @Param("example") UserRoleRelationExample example);

    int updateByPrimaryKeySelective(UserRoleRelation record);

    int updateByPrimaryKey(UserRoleRelation record);
}