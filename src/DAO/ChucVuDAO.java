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
public class ChucVuDAO {
     Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs= null;
    
    
    
    public ChucVuDAO()
    {
    }
    public static void main(String[] args) {
        ChucVuDAO cvdao = new ChucVuDAO();
        ArrayList<ChucVuDTO> cvl = cvdao.getChucvu();
        
        for (ChucVuDTO cv : cvl)
        {
            System.out.println(cv.getMaCv()+" " +  cv.getTenCv()+" " + cv.getMaNvcv()+" " +
                    cv.getTenNvcv()+" " +cv.getNgaybonhiem()+" " + cv.getGhichu() + "  " + cv.getTrangthai()) ;
        }
        
    }
    public ArrayList<ChucVuDTO> getChucvu() {
    try {
        conn = DBConnection.getConnection();
        stmt = conn.prepareStatement("SELECT cv.MaCv, cv.TenCv, nv.MaNv, nv.TenNv AS TenNvcv,"
                            + " cv.NgayBoNhiem, cv.GhiChu , cv.TrangThai " +
                                     "FROM Nhanvien nv JOIN ChucVu cv ON nv.MaCv = cv.MaCv");
        ArrayList<ChucVuDTO> chucvudao = new ArrayList();
        rs = stmt.executeQuery();
            
        while (rs.next()) {
            chucvudao.add(new ChucVuDTO(
                rs.getString("MaCv"),
                rs.getString("TenCv"),
                rs.getString("MaNv"),
                rs.getString("TenNvcv"),
                rs.getDate("NgayBoNhiem"),
                rs.getString("GhiChu"),
                    rs.getInt("Trangthai")
            ));        
        }
        return chucvudao;
    } catch (SQLException e) {
        return null;
    } finally {
        DBConnection.closeConnection(conn, stmt, rs);
    }
}

}
