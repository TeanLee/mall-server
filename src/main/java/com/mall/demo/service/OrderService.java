package com.mall.demo.service;

import com.mall.demo.bean.Order;
import com.mall.demo.bean.Product;
import com.mall.demo.bean.User;
import com.mall.demo.mapper.OrderMapper;
import com.mall.demo.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class OrderService {
    @Autowired
    User user;
    @Autowired
    Product product;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    ProductMapper productMapper;

    public void add(String orderItem) {
        int uid = user.getUid();
        int status = 0; // 初次提交订单，状态都是待付款，后面会新增修改订单状态的方法
        String orderTime = String.valueOf(System.currentTimeMillis());
        orderMapper.add(orderItem, orderTime, uid, status);
    }

    public List<Order> list(Integer status) {
        int uid = user.getUid();
        return orderMapper.list(uid, status);
    }

    /**
     * 从订单表中解析出用户下单的商品id 和相应的数量。目前是用 json 字段存储的。
     * 解析出来之后需要在商品表中查询对应的商品详情，返回由商品详情+数量组成的 Map。在订单页面进行展示。
     * @return
     */
    public List orderList() {
        int uid = user.getUid();
        // 获取所有符合条件的订单（当前用户 + 付款状态）
        List orders = orderMapper.list(uid, null);
        log.info("orders：" + orders);


        List ordersList = new ArrayList();

        for (int i = 0; i < orders.size(); i++) {
            Order order = (Order) orders.get(i);

            log.info("order.getOrderItem()：" + order.getOrderItem());
            JSONArray arrayObj = new JSONArray(order.getOrderItem());

            log.info(String.valueOf(arrayObj.length()));

            List list = new ArrayList();

            // 解析每个订单中的数据
            for (int j = 0; j < arrayObj.length(); j++) {
                Map<String, Object> map = new HashMap<>(); // 由商品详情和商品数量组成的 Map
                JSONObject jsonObject = arrayObj.getJSONObject(j);
                String productId = String.valueOf(jsonObject.get("productId"));
                String count = String.valueOf(jsonObject.get("count"));
                Product product = productMapper.getProductById(Integer.valueOf(productId));
                map.put("count", count);
                map.put("product", product);
                list.add(map);
            }

            ordersList.add(list);
        }

        return ordersList;
    }
}
