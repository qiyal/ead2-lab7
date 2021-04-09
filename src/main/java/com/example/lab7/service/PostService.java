package com.example.lab7.service;

import com.example.lab7.db.dao.PostDao;
import com.example.lab7.entity.Post;

import java.util.List;

public class PostService {
    private PostDao postDao;

    public PostService() {
        this.postDao = new PostDao();
    }

    public List<Post> getAllPost() {
        return postDao.getAllPost();
    }
}
