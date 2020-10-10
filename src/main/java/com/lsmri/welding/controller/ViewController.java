package com.lsmri.welding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
