package com.mall.demo.controller;

import com.mall.demo.bean.ShoppingCart;
import com.mall.demo.service.ShoppingCartService;
import com.mall.demo.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Slf4j
@RequestMapping("/shopping-cart")
@Controller
public class ShoppingCartController {
    @Autowired
    ShoppingCart shoppingCart;
    @Autowired
    ShoppingCartService shoppingCartService;

    @ResponseBody
    @PostMapping("/add")
    public void addProduct(int productId) {
        // 先查询数据库中该用户是否有该产品，如果有，直接数量++。否则新增一条数据
        ShoppingCart shoppingCart = shoppingCartService.getByProductId(productId);
        if (shoppingCart == null) shoppingCartService.add(productId);
        else shoppingCartService.updateCount(productId);

        // 对于加购的商品，将 productId 等记录在 redis 中
        Jedis jedis = RedisUtil.getConnecttion();


        // 通过有序集合 zset 实现点击量的统计
        Double score = jedis.zscore("products", "productId-" + productId);
        if (score == null) {
            jedis.zadd("products", 1, "productId-" + productId);
        } else {
            jedis.zincrby("products", 1, "productId-" + productId);
        }


//        Set productsSet = jedis.zrevrange("products", 0 , 10);
//
//        for(Object value: productsSet){
//            System.out.println(value + "------" + jedis.zscore("products", (String) value));
//        }

        jedis.close();
    }

    @ResponseBody
    @PostMapping("/cut")
    public void cutProduct(int productId) {
        shoppingCartService.cutCount(productId);
    }

    @ResponseBody
    @DeleteMapping("/delete")
    public void deleteByProductId(Integer productId) {
        shoppingCartService.deleteByProductId(productId);
    }

    @ResponseBody
    @GetMapping("/all")
    public List<ShoppingCart> getShoppingCartByUid() {
        return shoppingCartService.getShoppingCartByUid();
    }

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "hello shopping cart!";
    }
}
