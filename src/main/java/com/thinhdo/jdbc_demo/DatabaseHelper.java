/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhdo.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doduy
 */
public class DatabaseHelper {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/school";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "DoDuyThinh!999";
    
    /**
     * @return connection: Kết nối database
     */
    public static Connection getConnection() {
        
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy Driver");
        } 
        
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Kết nối database thất bại");
        }
        return connection;
    }
}
