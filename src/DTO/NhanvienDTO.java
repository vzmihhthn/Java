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
public class NhanvienDTO {
    private String MaNv;
    private String TenNv;  
    private String Gioitinh;
    private String Diachi;
    private String Email;
    private String Sodienthoai;
    private Date Ngayvaolam;
    private String MaCv;
    private String SoCMND;
    private String MaPB;
    private String MaDA;

    public NhanvienDTO()
    {

    }
    public NhanvienDTO(String MaNv, String TenNv, String Gioitinh, 
            String Diachi, String Email, String Sodienthoai, 
            Date Ngayvaolam, String MaCv, String SoCMND, String MaPB, String MaDA) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.Gioitinh = Gioitinh;
        this.Diachi = Diachi;
        this.Email = Email;
        this.Sodienthoai = Sodienthoai;
        this.Ngayvaolam = Ngayvaolam;
        this.MaCv = MaCv;
        this.SoCMND = SoCMND;
        this.MaPB = MaPB;
        this.MaDA = MaDA;
    }
    

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }

    public Date getNgayvaolam() {
        return Ngayvaolam;
    }

    public void setNgayvaolam(Date Ngayvaolam) {
        this.Ngayvaolam = Ngayvaolam;
    }

    public String getMaCv() {
        return MaCv;
    }

    public void setMaCv(String MaCv) {
        this.MaCv = MaCv;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getMaDA() {
        return MaDA;
    }

    public void setMaDA(String MaDA) {
        this.MaDA = MaDA;
    }
    
    
}
