package com.mall.demo.controller;

import com.mall.demo.bean.Product;
import com.mall.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @ResponseBody
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}
