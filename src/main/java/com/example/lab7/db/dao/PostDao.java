package com.example.lab7.db.dao;

import com.example.lab7.db.DBConnection;
import com.example.lab7.entity.Post;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostDao {
    private DBConnection dbConnection;

    public PostDao() {
        this.dbConnection = new DBConnection("jdbc:mysql://localhost:3306/javaee_lab7?serverTimezone=UTC", "nur26erb", "nur26erb");
    }

    public List<Post> getAllPost() {
        dbConnection.openConnect();
        List<Post> posts = new ArrayList<>();
        ResultSet resultSet = dbConnection.getData("SELECT * FROM post");

        try {
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                Integer userId = resultSet.getInt("userId");
                String title = resultSet.getString("title");
                String text = resultSet.getString("text");
                Integer countLike = resultSet.getInt("countLike");
                Date day = resultSet.getDate("day");

                posts.add(new Post(id, userId, title, text, countLike, day));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("GET ALL Post error!");
        }

        return posts;
    }
}
