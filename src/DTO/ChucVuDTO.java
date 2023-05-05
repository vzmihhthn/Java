/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author MI
 */
public class ChucVuDTO {
    private String MaCv;
    private String TenCv;
    private String MaNvcv;
    private String TenNvcv;
    private Date Ngaybonhiem;
    private String Ghichu;
    private int Trangthai;
    public ChucVuDTO()
    {
        
    }

    public ChucVuDTO(String MaCv, String TenCv, String MaNvcv, String TenNvcv, Date Ngaybonhiem, String Ghichu, int Trangthai) {
        this.MaCv = MaCv;
        this.TenCv = TenCv;
        this.MaNvcv = MaNvcv;
        this.TenNvcv = TenNvcv;
        this.Ngaybonhiem = Ngaybonhiem;
        this.Ghichu = Ghichu;
        this.Trangthai = Trangthai;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }



    public String getMaNvcv() {
        return MaNvcv;
    }

    public void setMaNvcv(String MaNvcv) {
        this.MaNvcv = MaNvcv;
    }

    public String getTenNvcv() {
        return TenNvcv;
    }

    public void setTenNvcv(String TenNvcv) {
        this.TenNvcv = TenNvcv;
    }


    public String getMaCv() {
        return MaCv;
    }

    public void setMaCv(String MaCv) {
        this.MaCv = MaCv;
    }

    public String getTenCv() {
        return TenCv;
    }

    public void setTenCv(String TenCv) {
        this.TenCv = TenCv;
    }

    public Date getNgaybonhiem() {
        return Ngaybonhiem;
    }

    public void setNgaybonhiem(Date Ngaybonhiem) {
        this.Ngaybonhiem = Ngaybonhiem;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    
}
