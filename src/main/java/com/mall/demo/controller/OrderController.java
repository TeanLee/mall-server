package com.mall.demo.controller;

import com.mall.demo.bean.Order;
import com.mall.demo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/order")
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @PostMapping("/add")
    public void add(@RequestBody Map<String, List> orderItem) {
        // 将前端传递的数据 [{"id": xx, "count": xxx}] 存进数据库
        List items = orderItem.get("orderItem");

        // 数据库存储字段声明为 json，因此要用 new JSONArray 方法，将接收的数组转化成 json 类型。
        // 又因为 Java 对应 数据库 json 字段为 String 类型，于是要转化成 String 字段往 Service 传递
        orderService.add(String.valueOf(new JSONArray(items)));
    }

    @ResponseBody
    @GetMapping("/list")
    public List<Order> list() {
        return orderService.list();
    }
}
