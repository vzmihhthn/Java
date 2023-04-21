/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MI
 */
public class DBConnection 
{
    public static Connection getConnection() 
    {
        Connection conn = null;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNS;encrypt=false";
            String user = "sa";
            String pass = "1234567";
            conn = DriverManager.getConnection(url,user,pass);
           if(conn != null)
                 System.out.println("Connect Successfully ! ");
             
         } catch (Exception e) {
              System.out.println("Cann't connect Database");
             System.out.println(e.toString());
             
             
         }
         
        return conn;
    }

    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("Cann't close connection");
        }
    }

    public static void closeConnection(Connection conn, Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("Cann't close connection");
        }
    }
        public static void main(String[] args)
    {
        DBConnection DBConnection = new DBConnection(); 
        
        Connection conn = DBConnection.getConnection();
    }
}
