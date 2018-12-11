package com.enzo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhifeng on 2018/12/12.
 */
@Controller
@RequestMapping("/home")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
