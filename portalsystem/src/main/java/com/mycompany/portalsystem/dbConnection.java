package com.mycompany.portalsystem;

import java.sql.*;

public class dbConnection {
    Connection con = null;
    
    // sql database connection checker
    public static Connection connectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:AccountsDB.db");
            System.out.println("Connection succeeded.");
            return con;
        }
        catch(Exception e) {
            System.out.println("Connection failed." + e);
            return null;
        }
    }
}
