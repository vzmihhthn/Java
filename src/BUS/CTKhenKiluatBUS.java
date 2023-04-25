/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.*;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author MI
 */
public class CTKhenKiluatBUS 
{
    CTKhenKiLuatDAO ctkhenkiluatdao = new CTKhenKiLuatDAO();
    public  CTKhenKiluatBUS()
    {
        
    }
    public ArrayList<CTKhenKiLuatDTO> getCTKhenKiLuat()
    {
        return ctkhenkiluatdao.getCTKhenKiLuat();
    }
}
