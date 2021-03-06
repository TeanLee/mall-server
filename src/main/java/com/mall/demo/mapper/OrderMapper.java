package com.mall.demo.mapper;

import com.mall.demo.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    public void add(@Param("orderItem") String orderItem, @Param("orderTime") String orderTime, @Param("uid") int uid, @Param("status") int status);
    public List<Order> list(@Param("uid") int uid, @Param("status") Integer status);
    public void updateStatus(@Param("orderId") int orderId, @Param("status") Integer status, @Param("uid") Integer uid);
}
