package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yonghong Zhang
 * @create 2019-05-19 14:49
 */
@Controller
public class QuickStartController {
    @RequestMapping("/springboot")
    @ResponseBody
    public String quick(){
        return "hello Springboot";
    }
}
