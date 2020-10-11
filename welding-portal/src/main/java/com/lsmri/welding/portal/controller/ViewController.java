package com.lsmri.welding.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cui Yicheng
 * @date 2020-09-23
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index() {
        return "forward:/view/index.html";
    }

    // TODO(Yicheng): delete
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

}