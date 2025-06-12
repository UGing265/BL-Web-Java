/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class UtilDB {
    private static final String DB_NAME = "UserShopAir";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "12345";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;database="+ DB_NAME;
        conn = DriverManager.getConnection(url,DB_USERNAME,DB_PASSWORD);
        return conn;
    }
}
