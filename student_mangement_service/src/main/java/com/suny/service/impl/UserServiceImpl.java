package com.suny.service.impl;

import com.suny.dao.UserMapper;
import com.suny.pojo.User;
import com.suny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sunyuan
 * @date 2021/11/23 20:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
