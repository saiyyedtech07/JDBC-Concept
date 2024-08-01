package com.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
   String url="";
        String userName="kkkk";
        String password="iiii";

        Class.forName("com.mysql.jdbc.driver");
        Connection con= DriverManager.getConnection(url,userName,password);
    }

}
