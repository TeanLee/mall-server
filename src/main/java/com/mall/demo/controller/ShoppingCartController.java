package com.mall.demo.controller;

import com.mall.demo.bean.Product;
import com.mall.demo.bean.ShoppingCart;
import com.mall.demo.bean.User;
import com.mall.demo.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
