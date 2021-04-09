package com.example.lab7.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    // constructors
    public DBConnection() {}

    public DBConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    // methods
    public void openConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("DB Connection open false!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void closeConnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("DB Connection close false!");
        }
    }
}
