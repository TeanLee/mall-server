package com.mall.demo.mapper;

import com.mall.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    public User getUserByUsername(String username);
    public List<User> getUsers();
    public void addUser(String user);
    public void setInfo(@Param("username") String username, @Param("address") String address, @Param("phone") String phone, @Param("receiver") String receiver);
    public User getUserInfo(@Param("username") String username);
}
