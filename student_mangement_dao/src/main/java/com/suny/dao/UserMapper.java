package com.suny.dao;

import com.suny.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sunyuan
 * @date 2021/11/23 20:36
 */
@Mapper
public interface UserMapper {

    /**
     * 获取所有用户
     * @return List<User>
     */
    List<User> getAllUsers();
}
