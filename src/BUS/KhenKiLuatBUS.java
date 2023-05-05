/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.*;
import DTO.*;
import Exception.DuplicatedException;
import java.util.ArrayList;

/**
 *
 * @author MI
 */
public class KhenKiLuatBUS {
    KhenKiLuatDAO khenkiluatdao = new KhenKiLuatDAO();
    public  KhenKiLuatBUS()
    {
        
    }
    public ArrayList<KhenKiLuatDTO> getKhenKiLuat()
    {
        return khenkiluatdao.getKhenKiLuat();
    }
//    public boolean addKhenKiluat(KhenKiLuatDTO khenkluat) throws DuplicatedException 
//    {
//        ArrayList<KhenKiLuatDTO> list = khenkiluatdao.getKhenKiLuat();
//        for (KhenKiLuatDTO item : list )
//        {
//            if(item.getMaKTKL().equals(khenkluat.getMaKTKL()))
//            {
//                throw new DuplicatedException(" Mã bảo hiểm bị trùng ");
//            }
//        }
//        // không có mã bảo hiểm nào sẽ tự thêm vào mã bảo hiểm vào list
//        return khenkiluatdao.addKhenKiluat(khenkluat);
//    }
}
