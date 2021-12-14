package com.mall.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int uid;
    private String username;
    private String address;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
