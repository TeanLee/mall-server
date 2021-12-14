package com.mall.demo.service;

import com.mall.demo.bean.User;
import com.mall.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    public void addUser(String user) {
        userMapper.addUser(user);
    }
}
