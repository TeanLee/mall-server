package com.mall.demo.service;

import com.mall.demo.bean.Product;
import com.mall.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;

    public List<Product> getProducts() {
        return productMapper.getProducts();
    }
}