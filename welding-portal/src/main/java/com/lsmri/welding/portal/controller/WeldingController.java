package com.lsmri.welding.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cui Yicheng
 * @date 2020-10-12
 */
@Controller
@RequestMapping("/welding")
public class WeldingController {

    // TODO delete test
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "test";
    }

}
