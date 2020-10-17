package com.lsmri.welding.portal.service;

import com.lsmri.welding.model.WeldingDO;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-10-17
 */
public interface WeldingService {

    int save(WeldingDO weldingDO);

    List<WeldingDO> list(Integer pageNum, Integer pageSize);

}
