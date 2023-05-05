/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.DBConnection;
import DTO.PhongBanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author MI
 */
public class PhongbanDAO {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public static final int INDEX_TENPB = 0;
    public static final int INDEX_SODIENTHOAI = 1;

    public PhongbanDAO()
    {
    }
    public static void main(String[] args) {
        PhongbanDAO phongBanDAO = new PhongbanDAO();
ArrayList<PhongBanDTO> phongBanList = phongBanDAO.getPhongBan();
for (PhongBanDTO pb : phongBanList) {
    System.out.println(pb.getMaPB() + " " + pb.getTenPB() + " " + pb.getSoDienThoai() 
                                    +  " "+ pb.getSlnv() );
}
    }
    public ArrayList<PhongBanDTO> getPhongBan() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT pb.MaPB, pb.TenPB,pb.SoDienThoai, COUNT(nv.MaNv) AS SoLuongNhanVien, pb.TrangThai\n" +
                                         "FROM PhongBan pb\n" +
                                         "LEFT JOIN NhanVien nv ON pb.MaPB = nv.MaPB\n" +
                                         "GROUP BY pb.MaPB, pb.TenPB ,pb.SoDienThoai, pb.TrangThai");
            ArrayList<PhongBanDTO> phongbanDAO = new ArrayList();

            rs = stmt.executeQuery();
            while (rs.next()) 
            {
                
                phongbanDAO.add(new PhongBanDTO(rs.getString("MaPB").trim(), 
                        rs.getString("TenPB").trim(), 
                        rs.getString("SoDienThoai").trim(),
                        rs.getInt("SoLuongNhanVien"),
                        rs.getInt("Trangthai")
                                
                ));
            }
            return phongbanDAO;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public PhongBanDTO findPBByID(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM PhongBan WHERE MaPB = ?");
            stmt.setString(1, id);

            rs = stmt.executeQuery();

            while (rs.next()) {
                PhongBanDTO pbdto = new PhongBanDTO();
                pbdto.setMaPB(rs.getString("MaPB"));
                pbdto.setTenPB(rs.getString("TenPB"));
                pbdto.setSoDienThoai(rs.getString("SoDienThoai"));
                return pbdto;
            }
            
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
        return null;
    }

    public boolean addPhongBan(PhongBanDTO phongban) {
        try {
            conn = DBConnection.getConnection();
            
            stmt = conn.prepareStatement(
                    "INSERT INTO PhongBan (MaPB, TenPB, SoDienThoai) VALUES (?, ?, ?)");
            stmt.setString(1, phongban.getMaPB());
            stmt.setString(2, phongban.getTenPB());
            stmt.setString(3, phongban.getSoDienThoai());
            
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("Lỗi khi thêm phòng ban: " + e.getMessage());
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deletePhongBan(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM PhongBan WHERE MaPB = ?");
            stmt.setString(1, id);

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deletePhongBan(PhongBanDTO phongban) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM PhongBan WHERE MaPB = ?");
            stmt.setString(1, phongban.getMaPB());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updatePhongBan(PhongBanDTO phongban) {
        try {
            Object[] selection = phongban.getSelection();

            String table = "";
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) 
                {
                    switch (i)
                    {
                        case INDEX_TENPB ->
                            table += "TenPB = ? ,";
                        case INDEX_SODIENTHOAI ->
                            table += "SoDienThoai = ? ,";
                    }
                }
            }
            table = table.substring(0, table.length() - 1);

            conn = DBConnection.getConnection();
            
            stmt = conn.prepareStatement(
                    "UPDATE PhongBan SET " + table + "WHERE MaPB = ?");

            int index = 1;
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i])
                {
                    switch (i) {
                        case INDEX_TENPB ->
                            stmt.setString(index++, phongban.getTenPB());
                        case INDEX_SODIENTHOAI ->
                            stmt.setString(index++, phongban.getSoDienThoai());
                    }
                }
            }

            stmt.setString(index, phongban.getMaPB());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
        
    }

    
    
    
    
}
