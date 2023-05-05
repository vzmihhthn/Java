/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.*;
import DTO.*;
import java.util.ArrayList;
import Exception.DuplicatedException;
/**
 *
 * @author MI
 */
public class PhanCongDuAnBUS {
    PhanCongDuAnDAO phancongdadao = new PhanCongDuAnDAO();
    public PhanCongDuAnBUS()
    {
        
    }
    public  ArrayList <PhanCongDuAnDTO> getPhanCongDA()
    {
        return phancongdadao.getPhanCongDA();
    }
}
