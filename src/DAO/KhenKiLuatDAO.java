/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBConnection;
import DTO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MI
 */
public class KhenKiLuatDAO {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs= null;
    
    
    
    public KhenKiLuatDAO()
    {
    }
    public static void main(String[] args) {
        KhenKiLuatDAO khenkiluatdao = new KhenKiLuatDAO();
        ArrayList<KhenKiLuatDTO> kllist = khenkiluatdao.getKhenKiLuat();
        for (KhenKiLuatDTO kl : kllist)
        {
            System.out.println(kl.getMaNv()+ " "+  kl.getTennvkl()+ " "+kl.getHThuc());
        }
       
    }
    public  ArrayList<KhenKiLuatDTO> getKhenKiLuat()
    {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("select  nv.MaNv,nv.TenNv, ctkl.HinhThuc\n" +
    "from ChiTietKTKL ctkl join KhenThuongKyLuat kl on ctkl.MaKTKL=kl.MaKTKL\n" +
    "					join Nhanvien nv on kl.MaNv = nv.MaNv ");
            ArrayList<KhenKiLuatDTO> khenkiluatdao = new ArrayList();
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                khenkiluatdao.add(new KhenKiLuatDTO
                    (  rs.getString("MaNv" ),
                      rs.getString("TenNv" ),
                    rs.getString("HinhThuc")
                   ));        
            }
            return khenkiluatdao;
        } catch (SQLException e )
        {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
}
