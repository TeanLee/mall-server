package com.mall.demo.service;

import com.mall.demo.bean.Order;
import com.mall.demo.bean.User;
import com.mall.demo.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderService {
    @Autowired
    User user;
    @Autowired
    OrderMapper orderMapper;

    public void add(String orderItem) {
        int uid = user.getUid();
        int status = 0; // 初次提交订单，状态都是待付款，后面会新增修改订单状态的方法
        String orderTime = String.valueOf(System.currentTimeMillis());
        orderMapper.add(orderItem, orderTime, uid, status);
    }

    public List<Order> list() {
        return orderMapper.list();
    }
}
