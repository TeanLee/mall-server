package com.mall.demo.controller;

import com.mall.demo.bean.User;
import com.mall.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    User user;
    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping("/login")
    public void postUsername(@RequestParam("username") String username) {
        user.setUsername(username);
        // 数据库中查询表，是否存在当前用户，若不存在，则新建用户（插入新用户）
        User user = userService.getUserByUsername(username);
        if (user == null) {
            userService.addUser(username);
        }
    }

    @ResponseBody
    @PostMapping("/set-info")
    public void setInfo(@RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("receiver") String receiver) {
        user.setAddress(address);
        user.setPhone(phone);
        user.setReceiver(receiver);
        userService.setInfo(address, phone, receiver);
    }

    @ResponseBody
    @GetMapping("/info")
    public User getUserInfo() {
        User user = userService.getUserInfo();
        log.info(String.valueOf(user));
        return user;
    }

    @ResponseBody
    @GetMapping("all")
    public Map<String, Object> getUsers() {
        Map map = new HashMap();
        List<User> list = userService.getUsers();
        map.put("all", list);
        return map;
    }
}
