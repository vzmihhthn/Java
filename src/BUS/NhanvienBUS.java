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
public class NhanvienBUS {
    private ArrayList<NhanvienDTO> listNhanvienDTO = new ArrayList<>();
    NhanvienDAO nhanviendao = new NhanvienDAO();

    public NhanvienBUS()
    {

    }
    public NhanvienDTO getNhanvien(String maNv)
    {
        for(NhanvienDTO nvDTO : listNhanvienDTO)
        {
            if(nvDTO.getMaNv().equals(maNv))
            {
                return nvDTO;
            }
        }
        return null;
    }
    public  ArrayList<NhanvienDTO> getNhanvien()
    {
        return nhanviendao.getNhanvien();
    }
}
