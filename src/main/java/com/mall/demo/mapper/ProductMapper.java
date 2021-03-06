package com.mall.demo.mapper;


import com.mall.demo.bean.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    public List<Product> getProducts();
    public List<Product> getProductsByCategoryId(int id);
    public Product getProductById(int productId);
}
