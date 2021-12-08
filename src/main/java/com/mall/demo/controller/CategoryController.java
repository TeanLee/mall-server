package com.mall.demo.controller;

import com.mall.demo.bean.Category;
import com.mall.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @ResponseBody
    @GetMapping("/category/{id}")
    public Category getCategoryById(@PathVariable("id") int id) {
        return categoryService.getCategoryById(id);
    }
}
