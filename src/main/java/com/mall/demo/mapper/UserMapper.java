package com.mall.demo.mapper;

import com.mall.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public User getUserByUsername(String username);
    public List<User> getUsers();
}
