/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.*;
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
public class CTKhenKiLuatDAO 

{
        Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs= null;
    
    
    
        public CTKhenKiLuatDAO()
        {
        }
        public static void main(String[] args) {
            CTKhenKiLuatDAO ctkhenkiluatdao = new CTKhenKiLuatDAO();
            ArrayList<CTKhenKiLuatDTO> ctkllist = ctkhenkiluatdao.getCTKhenKiLuat();
            for (CTKhenKiLuatDTO ctkl : ctkllist)
            {
                System.out.println(ctkl.getMaNv()+"  "+ctkl.getTennvct()+"  "+ctkl.getSotien()+"  "+
                        ctkl.getNgayquyetdinh()+"  "+ctkl.getHinhthuc()+"  "+ctkl.getNoidung());
            }

        }
        
        public  ArrayList<CTKhenKiLuatDTO> getCTKhenKiLuat()
        {
            try {
                conn = DBConnection.getConnection();
                stmt = conn.prepareStatement("select  nv.MaNv,nv.TenNv, ctkl.SoTien,ctkl.NgayQuyetDinh,"
                        + "ctkl.HinhThuc,ctkl.NoiDung , ctkl.TrangThai \n" +
                        "from ChiTietKTKL ctkl join KhenThuongKyLuat kl on ctkl.MaCTKTKL=kl.MaCTKTKL\n" +
                        "join Nhanvien nv on kl.MaNv = nv.MaNv ");
                ArrayList<CTKhenKiLuatDTO> ctkhenkiluatdao = new ArrayList();
                rs = stmt.executeQuery();

                while(rs.next())
                {
                    ctkhenkiluatdao.add(new CTKhenKiLuatDTO
                        (  
                                rs.getString("MaNv" ),
                                rs.getString("TenNv" ),
                                rs.getFloat("SoTien" ),
                                rs.getDate("NgayQuyetDinh" ),
                          rs.getString("HinhThuc" ),
                        rs.getString("NoiDung"),
                                rs.getInt("TrangThai")
                       ));        
                }
                return ctkhenkiluatdao;
            } catch (SQLException e )
            {
                return null;
            } finally {
                DBConnection.closeConnection(conn, stmt, rs);
            }
        }
}
