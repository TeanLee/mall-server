package com.mall.demo.bean;

public class Category {
    private int catagoryId;
    private String category;

    public Category(String category) {
        this.category = category;
    }

    public Category(int catagoryId, String category) {
        this.catagoryId = catagoryId;
        this.category = category;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
