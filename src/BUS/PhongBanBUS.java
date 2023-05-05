/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhongbanDAO;
import DTO.PhongBanDTO;
import java.util.ArrayList;
import Exception.DuplicatedException;

/**
 *
 * @author MI
 */
public class PhongBanBUS {
    PhongbanDAO phongbandao = new PhongbanDAO();

    public PhongBanBUS() {
    }

    public ArrayList<PhongBanDTO> getPhongBan() {
        return phongbandao.getPhongBan();
    }

    public boolean addPhongBan(PhongBanDTO phongban) throws DuplicatedException 
    {
    ArrayList<PhongBanDTO> list = phongbandao.getPhongBan();

    for (PhongBanDTO item : list) {
        if (item.getMaPB().trim().equals(phongban.getMaPB().trim())) {
            throw new DuplicatedException("Mã phòng ban bị trùng");
        }
    }

    // Nếu không có phòng ban nào có mã tương tự, thêm phòng ban mới vào cơ sở dữ liệu
    return phongbandao.addPhongBan(phongban);
}

    public boolean deletePhongBan(String id) {
        return phongbandao.deletePhongBan(id);
    }

    public boolean deletePhongBan(PhongBanDTO phongban) {
        return phongbandao.deletePhongBan(phongban);
    }

    public boolean updatePhongBan(PhongBanDTO phongban) {
        return phongbandao.updatePhongBan(phongban);
    }
     public PhongBanDTO findPBByID(String id){
        return phongbandao.findPBByID(id);
    }
}
