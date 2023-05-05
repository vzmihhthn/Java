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
public class PhanCongDuAnDAO {
        Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
     public PhanCongDuAnDAO()
    {
    }
    public static void main(String[] args) {
        PhanCongDuAnDAO phancongdadao = new PhanCongDuAnDAO();
ArrayList<PhanCongDuAnDTO> daList = phancongdadao.getPhanCongDA();
for (PhanCongDuAnDTO da : daList) {
    System.out.println(da.getManv() + " " + da.getTennvda() + " " +da.getTennvpb()+ " " + 
                da.getTencvda() + " " + da.getNgaybd() + " " + da.getNgaykt()
                + " " + da.getTenda() + " " + da.getGhiChu() +" " + da.getTrangthai()) ;
}
    }
    public ArrayList<PhanCongDuAnDTO> getPhanCongDA() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT DISTINCT nv.MaNv, nv.TenNv,  pb.TenPB, cv.TenCv,"
                        + "da.NgayBD,da.NgayKT, COALESCE(da.TenDA, '') AS TenDA, da.GhiChu , da.TrangThai\n" +
                                    "FROM Nhanvien nv\n" +
                                    "JOIN ChucVu cv ON nv.MaCv = cv.MaCv\n" +
                                    "JOIN PhongBan pb ON nv.MaPB = pb.MaPB\n" +
                                    "LEFT JOIN PhanCong pc ON nv.MaNv = pc.MaNV\n" +
                                    "LEFT JOIN DuAn da ON pc.MaDA = da.MaDA\n" +
                                    "ORDER BY nv.MaNv;");
            ArrayList<PhanCongDuAnDTO> phancongdadao = new ArrayList();

            rs = stmt.executeQuery();
            while (rs.next()) 
            {
                
                phancongdadao.add(new PhanCongDuAnDTO(
                        rs.getString("Manv").trim(), 
                        rs.getString("TenNv").trim(), 
                        rs.getString("TenPB").trim(),
                        rs.getString("TenCv").trim(),
                        rs.getDate("NgayBD"),
                        rs.getDate("NgayKT"),
                        rs.getString("TenDA").trim(),
                        rs.getString("GhiChu"),
                        rs.getInt("TrangThai")
                ));
            }
            return phancongdadao;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
}
