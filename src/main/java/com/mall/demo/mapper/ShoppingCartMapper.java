package com.mall.demo.mapper;

import com.mall.demo.bean.ShoppingCart;
import com.mall.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
    public ShoppingCart getByProductId(@Param("productId") Integer productId,@Param("uid")  Integer uid);
    public void add(@Param("productId") Integer productId,@Param("uid") Integer uid);
    public void updateCount(@Param("productId") Integer productId,@Param("uid") Integer uid);
    public void cutCount(@Param("productId") Integer productId,@Param("uid") Integer uid);
    public void deleteByProductId(@Param("productId") Integer productId,@Param("uid") Integer uid);
    public List getShoppingCartByUid(@Param("uid") Integer uid);
}
