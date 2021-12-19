package com.mall.demo.controller;

import com.mall.demo.bean.Order;
import com.mall.demo.service.OrderService;
import com.mall.demo.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RequestMapping("/order")
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ShoppingCartService shoppingCartService;

    // 用户提交订单的功能
    @ResponseBody
    @PostMapping("/add")
    public void add(@RequestBody Map<String, ArrayList> orderItem) {
        // 将前端传递的数据 [{"id": xx, "count": xxx}] 存进数据库
        ArrayList items = orderItem.get("orderItem");

        // 步骤一：对用户提交的订单进行保存
        // 数据库存储字段声明为 json，因此要用 new JSONArray 方法，将接收的数组转化成 json 类型。
        // 又因为 Java 对应 数据库 json 字段为 String 类型，于是要转化成 String 字段往 Service 传递
        orderService.add(String.valueOf(new JSONArray(items)));

        // 步骤二：删除用户购物车中已经下单的数据
        for (int i = 0; i < items.size(); i++) {
            Map map = (Map) items.get(i);
//            log.info(String.valueOf(map.get("productId")));
            int productId = (int) map.get("productId");
            shoppingCartService.deleteByProductId(productId);
        }
    }


    /**
     * 查询当前用户的所有订单信息（商品详情+商品数量），如果不传参数，表示查询所有订单。
     * 否则：订单状态 status（0:待付款；1:待配送；2:待评价）
     * @param status
     * @return
     */
    @ResponseBody
    @GetMapping("/list")
    public List<Order> list(@RequestParam(value = "status", required = false) Integer status) {
        log.info("status：" + status);
        return orderService.list(status);
    }

    @ResponseBody
    @GetMapping("/list-detail")
    public List listTest(@RequestParam(value = "status", required = false) Integer status) {
        return orderService.orderList(status);
    }

    /**
     * 修改订单状态（0:待付款；1:待配送；2:待评价）
     * @param orderId
     * @param status
     */
    @ResponseBody
    @PostMapping("/update-status")
    public void updateStatus(@RequestParam("orderId") Integer orderId, @RequestParam("status") Integer status) {
        orderService.updateStatus(orderId, status);
    }
}
