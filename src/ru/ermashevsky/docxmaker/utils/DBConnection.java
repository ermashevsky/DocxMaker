/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ermashevsky.docxmaker.utils;

/**
 *
 * @author denic
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn;
    private static final String url = "jdbc:mysql://localhost:3306/docxaggregate-database";
    private static final String user = "root";//Username of database  
    private static final String pass = "11235813";//Password of database  

    public static Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException cnfe) {
            System.err.println("Error: " + cnfe.getMessage());
        }
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn != null && !conn.isClosed()) {
            return conn;
        }
        connect();
        return conn;
    }
}
