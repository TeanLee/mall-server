package com.mall.demo.service;

import com.mall.demo.bean.ShoppingCart;
import com.mall.demo.bean.User;
import com.mall.demo.mapper.ShoppingCartMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShoppingCartService {

    @Autowired
    User user;
    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    public ShoppingCart getByProductId(int productId) {
        int uid = user.getUid();
        return shoppingCartMapper.getByProductId(productId, uid);
    }

    public void add(int productId) {
        int uid = user.getUid();
        shoppingCartMapper.add(productId, uid);
    }

    public void updateCount(int productId) {
        int uid = user.getUid();
        shoppingCartMapper.updateCount(productId, uid);
    }

    public void cutCount(int productId) {
        int uid = user.getUid();
        shoppingCartMapper.cutCount(productId, uid);
    }

    public void deleteByProductId(int productId) {
        int uid = user.getUid();
        log.info("deleteByProductId：" + productId);
        shoppingCartMapper.deleteByProductId(productId, uid);
    }

    public List<ShoppingCart> getShoppingCartByUid() {
        int uid = user.getUid();
        List products =  shoppingCartMapper.getShoppingCartByUid(uid);
        return shoppingCartMapper.getShoppingCartByUid(uid);
    }
}
