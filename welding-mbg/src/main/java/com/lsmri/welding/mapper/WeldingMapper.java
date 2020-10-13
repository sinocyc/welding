package com.lsmri.welding.mapper;

import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.model.WeldingDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeldingMapper {
    long countByExample(WeldingDOExample example);

    int deleteByExample(WeldingDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeldingDO record);

    int insertSelective(WeldingDO record);

    List<WeldingDO> selectByExample(WeldingDOExample example);

    WeldingDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeldingDO record, @Param("example") WeldingDOExample example);

    int updateByExample(@Param("record") WeldingDO record, @Param("example") WeldingDOExample example);

    int updateByPrimaryKeySelective(WeldingDO record);

    int updateByPrimaryKey(WeldingDO record);
}