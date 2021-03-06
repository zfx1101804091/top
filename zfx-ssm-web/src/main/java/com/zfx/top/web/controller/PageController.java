package com.zfx.top.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2019/8/15 0015 16:23
 */

@Controller
public class PageController {
    
    @RequestMapping("login")
    public String login(){
        return "index";
    }

    @RequestMapping("registered")
    public String registered(){
        return "registered";
    } 
    
    @RequestMapping("loginSuccess")
    @ResponseBody
    public String loginSuccess(){
        return "success";
    }
}
