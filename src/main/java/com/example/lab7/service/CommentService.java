package com.example.lab7.service;

import com.example.lab7.db.dao.CommentDao;

public class CommentService {
    private CommentDao commentDao;

    private CommentService() {
        commentDao = new CommentDao();
    }

    public int getCountCommentsByPostId(Integer postId) {
        return commentDao.getCountCommentsById(postId);
    }
}
