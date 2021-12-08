package com.mall.demo.bean;

public class Product {
    private int productId;
    private String banner;
    private double price;
    private double oldPrice;
    private int categoryId;
    private String unit;

    public Product(int productId, String banner, double price, double oldPrice, int categoryId, String unit) {
        this.productId = productId;
        this.banner = banner;
        this.price = price;
        this.oldPrice = oldPrice;
        this.categoryId = categoryId;
        this.unit = unit;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
