package com.example.lab7.service;

import com.example.lab7.db.dao.UserDao;
import com.example.lab7.bean.User;

public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

//    public User getUserByUsernameAndPassword() {
//
//    }
    public boolean checkUserByUsernamePassword(String username, String password) {
        return userDao.getUserByUsernamePassword(username, password) != null;
    }
}
