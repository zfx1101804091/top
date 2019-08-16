package com.zfx.top.mapper;

import com.zfx.top.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2019/8/13 0013 15:08
 */
public interface UserMapper {

    User queryUser(@Param("username") String username, @Param("password")String password);
    
}
