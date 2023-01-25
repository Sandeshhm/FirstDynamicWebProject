package com.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static String url = "jdbc:mysql://localhost:3306/customer1";    
    private static String driverName = "com.mysql.cj.jdbc.Driver";  
    private static String username = "root";  
    private static String password = "sandy@145";
    private static Connection con= null;
    //private static String urlstring;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
         //       con = DriverManager.getConnection(url, username, password);
            	con = DriverManager.getConnection("jdbc:mysql://localhost/customer1?" +
            		                                   "user=root&password=sandy@145");

            } catch (SQLException ex) {
                // log an exception. fro example:
            	ex.printStackTrace();
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }
}