package com.example.lab7.db.dao;

import com.example.lab7.db.DBConnection;

public class UserDao {
    private DBConnection connection;
    private String tableName;

    // constructors
    public UserDao() {}

    public UserDao(DBConnection connection, String tableName) {
        this.connection = connection;
        this.tableName = tableName;
    }

    //getters and setters
    public DBConnection getConnection() {
        return connection;
    }

    public void setConnection(DBConnection connection) {
        this.connection = connection;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    //method

}
