package com.lsmri.welding.mapper;

import com.lsmri.welding.model.PermissionDO;
import com.lsmri.welding.model.PermissionDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    long countByExample(PermissionDOExample example);

    int deleteByExample(PermissionDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionDO record);

    int insertSelective(PermissionDO record);

    List<PermissionDO> selectByExample(PermissionDOExample example);

    PermissionDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionDO record, @Param("example") PermissionDOExample example);

    int updateByExample(@Param("record") PermissionDO record, @Param("example") PermissionDOExample example);

    int updateByPrimaryKeySelective(PermissionDO record);

    int updateByPrimaryKey(PermissionDO record);
}