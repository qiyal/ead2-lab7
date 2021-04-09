package com.example.lab7.dean;

import com.example.lab7.entity.Comment;
import com.example.lab7.entity.Post;

import java.io.Serializable;

public class PostDean implements Serializable {
    private Post post = null;
    private Comment comment = null;
    private String username = null;

    // empty constructor
    public PostDean() {}

    // getter and setters
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
