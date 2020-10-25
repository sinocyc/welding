package com.lsmri.welding.portal.service;

import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.portal.dto.AddWeldingQuery;
import com.lsmri.welding.portal.dto.ListWeldingQuery;

import java.util.List;

/**
 * 焊接数据服务接口
 *
 * @author Cui Yicheng
 * @date 2020-10-17
 */
public interface WeldingService {

    /**
     * 新建焊接数据
     *
     * @param addWeldingQuery 焊接数据
     * @return 新建数量
     */
    int save(AddWeldingQuery addWeldingQuery);

    /**
     * 根据条件查询焊接数据
     *
     * @param listWeldingQuery 查询条件
     * @param pageNum          页数
     * @param pageSize         每页条数
     * @return 焊接数据列表
     */
    List<WeldingDO> list(ListWeldingQuery listWeldingQuery, Integer pageNum, Integer pageSize);

    /**
     * 更新焊接数据
     *
     * @param weldingDO 焊接数据
     * @return 更新数量
     */
    int update(WeldingDO weldingDO);

    /**
     * 根据id删除焊接数据
     *
     * @param id 数据id
     * @return 删除条数
     */
    int delete(Long id);
}
