package com.zfx.top.service.impl;

import com.zfx.top.mapper.UserMapper;
import com.zfx.top.pojo.User;
import com.zfx.top.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2019/8/13 0013 16:30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    public User queryUser(String username, String password) {
        User userList =  userMapper.queryUser(username,password);
        return userList;
    }
}
