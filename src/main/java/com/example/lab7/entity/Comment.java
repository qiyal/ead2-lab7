package com.example.lab7.entity;

import java.util.Date;

public class Comment {
    private Integer id;
    private Integer user_id;
    private Integer post_id;
    private String text;
    private Integer count_like;
    private Date day;

    // constrictors
    public Comment() {}

    public Comment(Integer id, Integer user_id, Integer post_id, String text, Integer count_like, Date day) {
        this.id = id;
        this.user_id = user_id;
        this.post_id = post_id;
        this.text = text;
        this.count_like = count_like;
        this.day = day;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCount_like() {
        return count_like;
    }

    public void setCount_like(Integer count_like) {
        this.count_like = count_like;
    }
}
