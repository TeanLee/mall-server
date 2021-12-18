package com.mall.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品-订单表。反应订单和商品的对应关系。
 */
@AllArgsConstructor //全参构造函数
@NoArgsConstructor  //无参构造函数
@Data
public class ProductOrder {
    private int id;
    private int productId;
    private int orderId;
}
