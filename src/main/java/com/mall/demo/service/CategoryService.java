package com.mall.demo.service;

import com.mall.demo.bean.Category;
import com.mall.demo.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> getCategories() {
        return categoryMapper.getCategories();
    }
    public Category getCategoryById(int id) {
        return categoryMapper.getCategoryById(id);
    }
}
