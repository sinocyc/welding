package com.lsmri.welding.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面控制器
 *
 * @author Cui Yicheng
 * @date 2020-09-23
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index() {
        return "forward:/view/index.html";
    }

}
