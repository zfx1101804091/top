package com.zfx.top.web.controller;

import com.zfx.top.pojo.User;
import com.zfx.top.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2019/8/13 0013 15:17
 */
@Controller()
public class UserController {
    
    @Autowired
    private UserService userService;
    

    @RequestMapping("tologin")
    @ResponseBody
    public String login(HttpServletRequest request){

        String username = (String) request.getParameter("txtUser");      
        String password = (String) request.getParameter("txtPwd");      
        User userList = userService.queryUser(username,password);
        if(userList==null){
            String respone ="{\"msg\":\"error\"}";
            return respone;
        }else {
            JSONObject jsonObject = JSONObject.fromObject(userList);
            return jsonObject.toString();
        }
    }
}
