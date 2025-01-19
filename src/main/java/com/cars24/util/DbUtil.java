package com.cars24.util;

import com.cars24.config.DbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
    private static Connection dbConnection;
    public static Connection getDbConnection(){
        if (dbConnection==null){
        try {
            dbConnection =DriverManager.getConnection(DbConfig.host,DbConfig.username,DbConfig.password);
            System.out.println("Connection successful");

        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            throw new RuntimeException(e);
        }}
        return dbConnection;
    }

}
