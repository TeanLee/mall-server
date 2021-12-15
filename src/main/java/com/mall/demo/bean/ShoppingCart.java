package com.mall.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    private int cartId;
    private int uid;
    private int productId;
    private int count;
    private boolean hasBought;

    public ShoppingCart() {
    }

    public ShoppingCart(int cartId, int uid, int productId, int count, boolean hasBought) {
        this.cartId = cartId;
        this.uid = uid;
        this.productId = productId;
        this.count = count;
        this.hasBought = hasBought;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isHasBought() {
        return hasBought;
    }

    public void setHasBought(boolean hasBought) {
        this.hasBought = hasBought;
    }
}
