/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;


import java.sql.*;


/**
 *
 * @author MI
 */
public class Connect {

/**
 *
 * @author MI
 */
    public Connection getConnection()
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
             System.out.println(e.toString());
             
             
         }
         
         return conn;

    }
    public static void main(String[] args)
    {
        Connect connect = new Connect();
        Connection conn = connect.getConnection();
    }

     
    

        
        
    
}
    
