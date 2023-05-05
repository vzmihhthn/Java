/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.*;
import DTO.BaoHiemDTO;
import java.util.ArrayList;
import Exception.*;

/**
 *
 * @author MI
 */
public class BaoHiemBUS {
    BaoHiemDAO baohiemdao = new BaoHiemDAO();
    public  BaoHiemBUS()
    {
        
    }
    public ArrayList<BaoHiemDTO> getBaohiem()
    {
        return baohiemdao.getBaohiem();
    }
    public boolean addBaohiem(BaoHiemDTO baohiem) throws DuplicatedException 
    {
        ArrayList<BaoHiemDTO> list = baohiemdao.getBaohiem();
        for (BaoHiemDTO item : list )
        {
            if(item.getMaBH().equals(baohiem.getMaBH()))
            {
                throw new DuplicatedException(" Mã bảo hiểm bị trùng ");
            }
        }
        // không có mã bảo hiểm nào sẽ tự thêm vào mã bảo hiểm vào list
        return baohiemdao.addBaohiem(baohiem);
    }
    
}
