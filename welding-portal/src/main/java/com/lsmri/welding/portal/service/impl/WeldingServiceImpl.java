package com.lsmri.welding.portal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lsmri.welding.mapper.WeldingMapper;
import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.model.WeldingDOExample;
import com.lsmri.welding.portal.service.WeldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public int save(WeldingDO weldingDO) {
        return weldingMapper.insert(weldingDO);
    }

    @Override
    public List<WeldingDO> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        WeldingDOExample weldingExample = new WeldingDOExample();
        return weldingMapper.selectByExample(weldingExample);
    }

}
