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
public class ChucVuBUS {
    ChucVuDAO chucvudao = new ChucVuDAO();
    public ChucVuBUS()
    {
        
    }
    public ArrayList<ChucVuDTO> getChucvu()
    {
        return chucvudao.getChucvu();
    }
}
