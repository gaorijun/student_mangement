package com.suny.controller;

import com.suny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunyuan
 * @date 2021/11/23 22:24
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String getAllUsers(){
        System.out.println(userService.getAllUsers());
        return "hello!";
    }
}
