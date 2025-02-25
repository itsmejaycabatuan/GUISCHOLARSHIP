/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import error.pagenotfound;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
    private Connection connect;

    // Constructor to establish database connection
    public dbConnect() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarship", "root", "");
            
        } catch (SQLException ex) {
           pagenotfound pf = new pagenotfound();
           pf.setVisible(true);
        }
    }

    // Method to return the connection object
    public Connection getConnection() {
        return connect;
    }

    // Function to insert/update/delete data (returns number of affected rows)
    public int executeUpdate(String sql) {
        int result = 0;
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            result = pst.executeUpdate();
            System.out.println("Query Executed Successfully!");
        } catch (SQLException ex) {
            System.out.println("Query Execution Error: " + ex.getMessage());
        }
        return result;
    }

    // Function to retrieve data
    public ResultSet getData(String sql) {
        ResultSet rst = null;
        try {
            Statement stmt = connect.createStatement();
            rst = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Data Retrieval Error: " + ex.getMessage());
        }
        return rst;
    }

    // Close the database connection
    public void close() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
               
            }
        } catch (SQLException ex) {
            System.out.println("Error closing connection: " + ex.getMessage());
        }
    }
     public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }
}

