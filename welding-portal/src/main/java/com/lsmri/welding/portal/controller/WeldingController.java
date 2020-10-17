package com.lsmri.welding.portal.controller;

import com.lsmri.welding.common.api.CommonPage;
import com.lsmri.welding.common.api.CommonResult;
import com.lsmri.welding.model.WeldingDO;
import com.lsmri.welding.portal.service.WeldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
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
    public CommonResult save(WeldingDO weldingDO) {
        int saveNum = weldingService.save(weldingDO);
        return saveNum > 0 ? CommonResult.success(null) : CommonResult.failed();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public CommonResult list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
        List<WeldingDO> weldingList = weldingService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(weldingList));
    }

}
