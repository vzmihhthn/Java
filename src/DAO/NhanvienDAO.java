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
public class NhanvienDAO {
        Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs= null;
    public NhanvienDAO()
    {
        
    }
        public static void main(String[] args) {
        NhanvienDAO nhanviendao = new NhanvienDAO();
ArrayList<NhanvienDTO> nhanvienlist = nhanviendao.getNhanvien();
for (NhanvienDTO nv : nhanvienlist) {
    System.out.println(nv.getMaNv() +" "+ nv.getTenNv()+" "+ nv.getGioitinh()+" "
                        + nv.getNgaysinh() +" "+
                            nv.getDiachi()+" "+ nv.getEmail()+" "+nv.getSodienthoai() +" "+
                                    nv.getNgayvaolam()+" "+ nv.getSoCMND()+" "+ nv.getTenPbnv() +" "+
                                            nv.getTenCvnv() + " " + nv.getMaBh()+ " " + nv.getTrangthai());
}
    }
    public ArrayList <NhanvienDTO> getNhanvien()
    {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(" 	select nv.MaNv, nv.TenNv,nv.GioiTinh,nv.NgaySinh,\n" +
"               nv.DiaChi ,nv.Email,nv.SoDienThoai, nv.NgayVaoLam ,nv.SoCMND,\n" +
"               pb.TenPB,cv.TenCv , nv.MaBH ,nv.TrangThai \n" +
"                from Nhanvien nv  join ChucVu cv on nv.MaCv = cv.MaCv\n" +
"						join PhongBan pb on nv.MaPB = pb.MaPB" );
            ArrayList<NhanvienDTO> nhanviendao = new ArrayList();
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                nhanviendao.add(new NhanvienDTO
                    ( rs.getString("MaNv" ),
                    rs.getString("TenNv" ),
                    rs.getString("GioiTinh"),
                    rs.getDate("NgaySinh"),
                    rs.getString("DiaChi" ),
                    rs.getString("Email" ),
                    rs.getString("SoDienThoai"),
                    rs.getDate("NgayVaoLam" ),
                    rs.getString("SoCMND" ),
                    rs.getString("TenPB" ),
                    rs.getString("TenCv" ),
                    rs.getString("MaBH"),
                    rs.getInt("Trangthai")
       
                    ));       
                
            }
            return nhanviendao;
        } catch (Exception e) {
            return null;
            
        } finally {
             DBConnection.closeConnection(conn, stmt, rs);
        }
    }
}
