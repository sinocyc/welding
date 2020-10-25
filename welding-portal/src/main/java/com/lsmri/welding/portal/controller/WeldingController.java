package com.lsmri.welding.portal.controller;

import com.lsmri.welding.auth.constant.AuthorityName;
import com.lsmri.welding.common.api.CommonPage;
import com.lsmri.welding.common.api.CommonResult;
import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.portal.dto.AddWeldingQuery;
import com.lsmri.welding.portal.dto.ListWeldingQuery;
import com.lsmri.welding.portal.service.WeldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 焊接数据控制器
 *
 * @author Cui Yicheng
 * @date 2020-10-12
 */
@Controller
@RequestMapping("/welding")
public class WeldingController {

    @Autowired
    private WeldingService weldingService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.EDIT + "')")
    public CommonResult save(@Validated AddWeldingQuery addWeldingQuery) {
        int saveNum = weldingService.save(addWeldingQuery);
        return saveNum > 0 ? CommonResult.success(null) : CommonResult.failed("新增数据失败。");
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.VIEW + "')")
    public CommonResult list(ListWeldingQuery listWeldingQuery,
                             @RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        List<WeldingDO> weldingList = weldingService.list(listWeldingQuery, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(weldingList));
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.EDIT + "')")
    public CommonResult update(WeldingDO weldingDO) {
        int saveNum = weldingService.update(weldingDO);
        return saveNum > 0 ? CommonResult.success(null) : CommonResult.failed("编辑数据失败。");
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('" + AuthorityName.EDIT + "')")
    public CommonResult delete(@RequestParam(name = "id") Long id) {
        int deleteNum = weldingService.delete(id);
        return deleteNum > 0 ? CommonResult.success(null) : CommonResult.failed("修改数据失败。");
    }

}
