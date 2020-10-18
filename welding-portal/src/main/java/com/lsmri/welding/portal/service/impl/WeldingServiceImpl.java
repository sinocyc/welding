package com.lsmri.welding.portal.service.impl;

import com.github.pagehelper.PageHelper;
import com.lsmri.welding.mapper.WeldingMapper;
import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.model.WeldingDOExample;
import com.lsmri.welding.portal.dto.AddWeldingQuery;
import com.lsmri.welding.portal.dto.ListWeldingQuery;
import com.lsmri.welding.portal.service.WeldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-10-17
 */
@Service
public class WeldingServiceImpl implements WeldingService {

    @Autowired
    private WeldingMapper weldingMapper;

    @Override
    public int save(AddWeldingQuery addWeldingQuery) {
        WeldingDO welding = new WeldingDO();
        welding.setBaseMetal(addWeldingQuery.getBaseMetal());
        welding.setWeldMaterial(addWeldingQuery.getWeldMaterial());
        welding.setThickness(addWeldingQuery.getThickness());
        welding.setPosition(addWeldingQuery.getPosition());
        welding.setType(addWeldingQuery.getType());
        welding.setWidth(addWeldingQuery.getWidth());
        welding.setGap(addWeldingQuery.getGap());
        welding.setAngle(addWeldingQuery.getAngle());
        welding.setLayer(addWeldingQuery.getLayer() == null ? 0 : addWeldingQuery.getLayer());
        welding.setPath(addWeldingQuery.getPath() == null ? 0 : addWeldingQuery.getPath());
        welding.setWireFeedSpeed(addWeldingQuery.getWireFeedSpeed());
        welding.setVoltage(addWeldingQuery.getVoltage());
        welding.setCurrent(addWeldingQuery.getCurrent());
        welding.setSpeed(addWeldingQuery.getSpeed());
        welding.setFrequency(addWeldingQuery.getFrequency() == null ? 0 : addWeldingQuery.getFrequency());
        welding.setAmplitude(addWeldingQuery.getAmplitude() == null ? 0 : addWeldingQuery.getAmplitude());
        welding.setWaitl(addWeldingQuery.getWaitl() == null ? 0 : addWeldingQuery.getWaitl());
        welding.setWaita(addWeldingQuery.getWaita() == null ? 0 : addWeldingQuery.getWaita());
        return weldingMapper.insert(welding);
    }

    @Override
    public List<WeldingDO> list(ListWeldingQuery listWeldingQuery, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        WeldingDOExample weldingExample = new WeldingDOExample();
        WeldingDOExample.Criteria criteria = weldingExample.createCriteria();
        if (StringUtils.hasText(listWeldingQuery.getPosition())) {
            criteria.andPositionEqualTo(listWeldingQuery.getPosition());
        }
        if (listWeldingQuery.getThickness() != null) {
            criteria.andThicknessEqualTo(listWeldingQuery.getThickness());
        }
        if (listWeldingQuery.getWidth() != null) {
            criteria.andWidthEqualTo(listWeldingQuery.getWidth());
        }
        if (listWeldingQuery.getGap() != null) {
            criteria.andGapEqualTo(listWeldingQuery.getGap());
        }
        if (listWeldingQuery.getAngle() != null) {
            criteria.andAngleEqualTo(listWeldingQuery.getAngle());
        }
        return weldingMapper.selectByExample(weldingExample);
    }

    @Override
    public int update(WeldingDO weldingDO) {
        return weldingMapper.updateByPrimaryKeySelective(weldingDO);
    }

    @Override
    public int delete(Long id) {
        return weldingMapper.deleteByPrimaryKey(id);
    }

}
