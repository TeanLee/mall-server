package com.mall.demo.mapper;

import com.mall.demo.bean.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 需要对 mapper 进行标注，说明这是一个 map，里面的内容才会生效
public interface CategoryMapper {
    public Category getCategoryById(int id);
}
