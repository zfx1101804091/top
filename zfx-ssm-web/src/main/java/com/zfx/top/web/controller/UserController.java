package com.zfx.top.web.controller;

import com.zfx.top.pojo.User;
import com.zfx.top.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2019/8/13 0013 15:17
 */
@Controller()
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("query")
    @ResponseBody
    public String queryUser(){
        User userList = userService.queryUser();
        return userList.toString();
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(HttpServletRequest request){
        
        User userList = userService.queryUser();
        return userList.toString();
    }
}
