package com.lsmri.welding.portal.service;

import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.portal.dto.AddWeldingQuery;
import com.lsmri.welding.portal.dto.ListWeldingQuery;

import java.util.List;

/**
 * @author Cui Yicheng
 * @date 2020-10-17
 */
public interface WeldingService {

    int save(AddWeldingQuery addWeldingQuery);

    List<WeldingDO> list(ListWeldingQuery listWeldingQuery, Integer pageNum, Integer pageSize);

    int update(WeldingDO weldingDO);

    int delete(Long id);
}
