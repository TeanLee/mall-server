package com.mall.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //全参构造函数
@NoArgsConstructor  //无参构造函数
@Data
public class Order {
    private int orderId;
    private String orderItem; // 订单对应的 JSON 数据。具体货物和数量。
    private String orderTime;
    private int uid;
    private int status;  // 订单状态（0:待付款；1:待配送；2:待评价）
}
