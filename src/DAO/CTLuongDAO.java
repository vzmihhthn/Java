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
public class CTLuongDAO
{
    Connection conn =  null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public CTLuongDAO()
    {
        
    }
    public static void main(String[] args) {
        CTLuongDAO ctluongdao = new CTLuongDAO();
        ArrayList<BangLuongDTO> luongList = ctluongdao.getLuong();
        for (BangLuongDTO luong : luongList)
        {
            System.out.println(luong.getMaLuong()+ " "+  luong.getTenNv()+ " "+luong.getHeSoluong()+ " "+ luong.getLuongCoBan()+ " "+ 
                                luong.getThuongPhat()+ " "+ luong.getTienPhuCap()+ " "+ luong.getTienLuong());
        }
        //" "+ pb.getTenNvbh()+
    }
    public  ArrayList<BangLuongDTO> getLuong()
    {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("""
                                         select l.MaLuong, nv.TenNv, l.HeSoLuong,l.LuongCoBan,l.ThuongPhat,l.TienPhuCap,
                                                                                  l.TienLuong
                                                                                  from Luong l
                                                                                  join Nhanvien nv on l.MaNv = nv.MaNv """);
            ArrayList<BangLuongDTO> ctluongdao = new ArrayList();
            rs = stmt.executeQuery();
            while(rs.next())
            {
                ctluongdao.add(new BangLuongDTO
                    (
                    rs.getString("MaLuong"),
                    rs.getString("TenNv").trim(),
                    rs.getFloat("LuongCoBan"),
                    rs.getFloat("HeSoLuong"),
                    rs.getFloat("ThuongPhat"),
                    rs.getFloat("TienPhuCap"),
                    rs.getFloat("TienLuong")
                        ));

            }
            return ctluongdao;
        } catch (Exception e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }

    }
    public  boolean addLuong( BangLuongDTO Luong)
    {
        try {
           
            
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("INSERT INTO Luong (MaBH, MaNv, LoaiBH, NgayCap, NgayHetHan) " +
                              "VALUES (?, ?, ?, ?, ?)");
            
            
            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}

