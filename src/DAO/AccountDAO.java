/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBConnection;
import DTO.AccountDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vithi
 */
public class AccountDAO {
    DBConnection ConnectDB = new DBConnection();
    public AccountDAO()
    {
        
    }
    public ArrayList<AccountDTO> listAccount()
    {
        Connection conn = DBConnection.getConnection();
        ArrayList<AccountDTO> listaccDTO = new ArrayList<>();
        try(conn) {
            String sql = "SELECT * FROM Account";
            ResultSet rs = ConnectDB.excuteQuery(sql);
            if(rs != null)
            {
                while(rs.next())
                {
                    String username = rs.getString("Username");
                    String password = rs.getString("Password");
                    String role = rs.getString("Role");

                    //AccountDTO acc = new AccountDTO(username, password, role_id, enable);
                    listaccDTO.add(new AccountDTO(username, password, role));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR! Cannot read table Account"); 
        } finally {
            ConnectDB.disConnect();
        }
        return listaccDTO;
    }
    
    public boolean add(AccountDTO accDTO)
    {
        ConnectDB = new DBConnection();
        boolean ok = ConnectDB.excuteUpdate("INSERT INTO Account VALUES ('" + accDTO.getUsername() + "', '" 
                        + accDTO.getPassword() + "', '" + accDTO.getRole() + "');");
        ConnectDB.disConnect();
        return ok;
    }
    
    public boolean delete(String username)
    {
        ConnectDB = new DBConnection();
        boolean ok = ConnectDB.excuteUpdate("DELETE FROM Account WHERE Username='" + username + "'");
        ConnectDB.disConnect();
        return ok;
    }
//    public void delete(String username)
//    {
//        ConnectDB = new DBConnection();
//        String sql = "DELETE FROM Account WHERE Username='" + username + "'";
//        ConnectDB.excuteUpdate(sql);
//    }
    
    public boolean update(String username, String pass, String role)
    {
        ConnectDB = new DBConnection();
        boolean ok = ConnectDB.excuteUpdate("UPDATE Account SET Password='" + pass + "', Role='" + role 
                + "' WHERE Username='" + username + "'");
        ConnectDB.disConnect();
        return ok;
    }
}
