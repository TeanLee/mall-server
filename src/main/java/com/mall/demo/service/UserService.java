package com.mall.demo.service;

import com.mall.demo.bean.User;
import com.mall.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    User user;
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

    public void setAddress(String address) {
        String username = user.getUsername();
        log.info("username：" + username);
        userMapper.setAddress(address, username);
    }

    public User getUserInfo() {
        String username = user.getUsername();
        log.info("username：" + username);
        return userMapper.getUserInfo(username);
    }
}
