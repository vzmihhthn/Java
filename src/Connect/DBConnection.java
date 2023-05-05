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
import javax.swing.JOptionPane;

/**
 *
 * @author MI
 */
public class DBConnection 
{
    static int countConection = 0;
    static int countQuery = 0;
    static int countUpdate = 0;
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    public static Connection getConnection() 
    {
        Connection conn = null;
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNS;encrypt=false";
            String user = "sa";
            String pass = "123";
            conn = DriverManager.getConnection(url,user,pass);
           if(conn != null)
                 System.out.println("Connect Successfully ! ");
             
         } catch (Exception e) {
              System.out.println("Cann't connect Database");
             System.out.println(e.toString());
             
             
         }
         
        return conn;
    }

    public ResultSet excuteQuery(String sql)
    {
        try {
            conn = getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            countQuery++;
            System.out.println(countQuery + ": Success Query! " + sql);
            //return rs;
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
            //return null;
        }
        return rs;
    }
    
    public boolean excuteUpdate(String sql)
    {
        try {
            conn = getConnection();
            st = conn.createStatement();
            st.executeUpdate(sql);
            countUpdate++;
            System.out.println(countUpdate + ": Success Update! " + sql);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR!");
            return false;
        }
    }
    public Boolean checkConnect() {
        if (conn == null || st == null) {
            JOptionPane.showMessageDialog(null, "-- ERROR!");
            return false;
        }
        return true;
    }
    public void disConnect() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (st != null) {
                st.close();
            }
            System.out.println("Success! **");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Không thể đóng kết nối \n" + ex.getLocalizedMessage());
        }
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
