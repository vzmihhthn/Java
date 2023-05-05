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
public class BaoHiemDAO
{
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs= null;
    
    public static final String INDEX_LOAIBH = null;
    
    public BaoHiemDAO()
    {
    }
    public static void main(String[] args) {
        BaoHiemDAO baohiemDAO = new BaoHiemDAO();
        ArrayList<BaoHiemDTO> baohiemList = baohiemDAO.getBaohiem();
        for (BaoHiemDTO pb : baohiemList)
        {
            System.out.println(pb.getMaBH()+ " "+  pb.getMaNv()+ " "+pb.getTenNvbh()+ " "+ pb.getLoaiBH()+ " "+ 
                                pb.getNgaycap()+ " "+ pb.getNgayhethan());
        }
        //" "+ pb.getTenNvbh()+
    }
    public  ArrayList<BaoHiemDTO> getBaohiem()
    {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("select b.MaBH,n.MaNv,n.TenNv, b.LoaiBH,b.NgayCap,b.NgayHetHan, b.TrangThai \n" +
                        "from BaoHiem b\n" +
                        "join Nhanvien n on b.MaBH = n.MaBH ");
            ArrayList<BaoHiemDTO> baohiemDAO = new ArrayList();
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                baohiemDAO.add(new BaoHiemDTO
                    ( rs.getString("MaBH" ),
                    rs.getString("MaNv" ),
                    rs.getString("TenNv"),
                    rs.getString("LoaiBH" ),
                    rs.getDate("NgayCap" ),
                    rs.getDate("NgayHetHan" ),
                    rs.getInt("Trangthai")
                    ));        
            }
            return baohiemDAO;
        } catch (SQLException e )
        {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    public  boolean addBaohiem( BaoHiemDTO baohiem)
    {
        try {
            java.util.Date ngayCap = baohiem.getNgaycap();
            java.sql.Date sqlNgayCap = new java.sql.Date(ngayCap.getTime());
            
            
            java.util.Date ngayhethan = baohiem.getNgayhethan();
            java.sql.Date sqlNgayhethan = new java.sql.Date(ngayhethan.getTime());

            
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("INSERT INTO Baohiem (MaBH, MaNv, LoaiBH, NgayCap, NgayHetHan) " +
                              "VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, baohiem.getMaBH());
            stmt.setString(2, baohiem.getMaNv());
            stmt.setString(3, baohiem.getLoaiBH());
            stmt.setDate(4, sqlNgayCap);
            stmt.setDate(5, sqlNgayhethan);
            
            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
//    public boolean updateBaohiem(BaoHiemDTO baohiem)
//    {
//        try {
//            Object[] selection = baohiem.getSelection();
//            String table ="";
//            for(int i=0 ; i< selection.length ; i++)
//            {
//                if((boolean) selection[i])
//                    switch (i)
//                    {
//                        case INDEX_LOAIBH ->
//                            table += "LoaiBH = ?,  ";
//                    }
//            }
//        } catch (Exception e) {
//        } finally {
//        }
//    }
}
