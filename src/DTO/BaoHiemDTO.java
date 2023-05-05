/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MI
 */
public class BaoHiemDTO {
 
    private String MaBH;
    private String MaNv;
    private String TenNvbh;
    private String LoaiBH;
    private Date Ngaycap;
    private Date Ngayhethan;
    private int Trangthai;
    
    public  BaoHiemDTO()
            {
            }

    public BaoHiemDTO(String MaBH, String MaNv, String TenNvbh,
            String LoaiBH, Date Ngaycap, Date Ngayhethan, int Trangthai) {
        this.MaBH = MaBH;
        this.MaNv = MaNv;
        this.TenNvbh = TenNvbh;
        this.LoaiBH = LoaiBH;
        this.Ngaycap = Ngaycap;
        this.Ngayhethan = Ngayhethan;
        this.Trangthai = Trangthai;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }


    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) {
        this.MaBH = MaBH;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNvbh() {
        return TenNvbh;
    }

    public void setTenNvbh(String TenNvbh) {
        this.TenNvbh = TenNvbh;
    }

    public String getLoaiBH() {
        return LoaiBH;
    }

    public void setLoaiBH(String LoaiBH) {
        this.LoaiBH = LoaiBH;
    }

    public Date getNgaycap() {
        return Ngaycap;
    }

    public void setNgaycap(Date Ngaycap) {
        this.Ngaycap = Ngaycap;
    }

    public Date getNgayhethan() {
        return Ngayhethan;
    }

    public void setNgayhethan(Date Ngayhethan) {
        this.Ngayhethan = Ngayhethan;
    }
    


    


    


    public Object[] getSelection() 
{
    ArrayList<Boolean> result = new ArrayList();
    if (this.MaBH != null && !this.MaBH.isEmpty()) {
        result.add(true);
    } else {
        result.add(false);
    }
    if (this.MaNv != null && !this.MaNv.isEmpty()) {
        result.add(true);
    } else {
        result.add(false);
    }
    if (this.LoaiBH != null && !this.LoaiBH.isEmpty()) {
        result.add(true);
    } else {
        result.add(false);
    }
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
        Date ngayCap = format.parse(format.format(this.Ngaycap));
        result.add(true);
    } catch (ParseException e) {
        result.add(false);
    }
    try {
        Date ngayHetHan = format.parse(format.format(this.Ngayhethan));
        result.add(true);
    } catch (ParseException e) {
        result.add(false);
    }
        Object[] result2 = result.toArray();
        return result2;
}
}


