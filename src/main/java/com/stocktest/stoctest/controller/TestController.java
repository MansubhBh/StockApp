package com.stocktest.stoctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class TestController {

    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "<h1>Hello first app</h1>";
    }
}
