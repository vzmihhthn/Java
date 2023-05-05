/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.*;
import DTO.*;
import java.util.ArrayList;
import Exception.*;
/**
 *
 * @author MI
 */
public class CTLuongBUS {
    CTLuongDAO ctluongdao = new CTLuongDAO();
    public  CTLuongBUS()
    {
        
    }
    public ArrayList<BangLuongDTO> getLuong()
    {
        return ctluongdao.getLuong();
    }
//    public boolean addLuong(BangLuongDTO luong) throws DuplicatedException 
//    {
//        ArrayList<BangLuongDTO> list = ctluongdao.getLuong();
//        for (BangLuongDTO item : list )
//        {
//            if(item.getMaLuong().equals(luong.getMaLuong()))
//            {
//                throw new DuplicatedException(" Mã bảo hiểm bị trùng ");
//            }
//        }
//        // không có mã bảo hiểm nào sẽ tự thêm vào mã bảo hiểm vào list
//        return ctluongdao.getLuong(luong);
//    }
    
}
