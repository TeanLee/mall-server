package com.mall.demo.controller;

import com.mall.demo.bean.Product;
import com.mall.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @ResponseBody
    @GetMapping("/list")
    public List<Product> getProducts() {
        return productService.getProducts();
    }


    @ResponseBody
    @GetMapping("/get-by-category-id")
    public List<Product> getProductsByCategoryId(@RequestParam("categoryId") int id) {
        return productService.getProductsByCategoryId(id);
    }

    @ResponseBody
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable("productId") int id) {
        return productService.getProductById(id);
    }
}
