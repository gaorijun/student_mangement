package com.suny.service;

import com.suny.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author sunyuan
 * @date 2021/11/23 20:56
 */
public interface UserService {

    /**
     * 获取所有用户
     * @return
     */
    List<User> getAllUsers();
}
