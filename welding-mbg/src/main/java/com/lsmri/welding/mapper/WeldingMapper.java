package com.lsmri.welding.mapper;

import com.lsmri.welding.model.Welding;
import com.lsmri.welding.model.WeldingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeldingMapper {
    long countByExample(WeldingExample example);

    int deleteByExample(WeldingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Welding record);

    int insertSelective(Welding record);

    List<Welding> selectByExample(WeldingExample example);

    Welding selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Welding record, @Param("example") WeldingExample example);

    int updateByExample(@Param("record") Welding record, @Param("example") WeldingExample example);

    int updateByPrimaryKeySelective(Welding record);

    int updateByPrimaryKey(Welding record);
}