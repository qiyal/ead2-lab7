package com.example.lab7.entity;

import java.util.Date;

public class Post {
    private Integer id;
    private Integer userId;
    private String title;
    private String text;
    private Integer countLike;
    private Date day;

    // constrictors
    public Post() {}

    public Post(Integer id, Integer userId, String title, String text, Integer countLike, Date day) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.text = text;
        this.countLike = countLike;
        this.day = day;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public void setCountLike(Integer countLike) {
        this.countLike = countLike;
    }
}
