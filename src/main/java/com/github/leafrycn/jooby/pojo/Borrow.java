package com.github.leafrycn.jooby.pojo;

public class Borrow {

    private String id;
    private Integer userId;
    private String item;

    public Borrow(Integer userId, String item) {
        this.userId = userId;
        this.item = item;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
