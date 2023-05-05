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
    private Date Ngaysinh;
    private String Diachi;
    private String Email;
    private String Sodienthoai;
    private Date Ngayvaolam;
    private String SoCMND;
    private String MaPB;
    private String TenPbnv;
    private String MaCv;
    private String TenCvnv;
    private String MaDA;
    private String Tendanv;
    private String MaBh;
    private int Trangthai;
    public NhanvienDTO()
    {

    }

    public NhanvienDTO(String MaNv, String TenNv, String Gioitinh, Date Ngaysinh,
            String Diachi, String Email, String Sodienthoai, Date Ngayvaolam, String SoCMND,
            String MaPB, String TenPbnv, String MaCv, String TenCvnv, String MaDA, String Tendanv  ) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Email = Email;
        this.Sodienthoai = Sodienthoai;
        this.Ngayvaolam = Ngayvaolam;
        this.SoCMND = SoCMND;
        this.MaPB = MaPB;
        this.TenPbnv = TenPbnv;
        this.MaCv = MaCv;
        this.TenCvnv = TenCvnv;
        this.MaDA = MaDA;
        this.Tendanv = Tendanv;
       
    }

    public NhanvienDTO(String MaNv, String TenNv, String Gioitinh, Date Ngaysinh, 
            String Diachi, String Email, String Sodienthoai, Date Ngayvaolam, 
            String SoCMND, String TenPbnv, String TenCvnv,String MaBh ,int Trangthai) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.Gioitinh = Gioitinh;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Email = Email;
        this.Sodienthoai = Sodienthoai;
        this.Ngayvaolam = Ngayvaolam;
        this.SoCMND = SoCMND;
        this.TenPbnv = TenPbnv;
        this.TenCvnv = TenCvnv;
        this.MaBh = MaBh;
         this.Trangthai = Trangthai;

    }

    public String getMaBh() {
        return MaBh;
    }

    public void setMaBh(String MaBh) {
        this.MaBh = MaBh;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
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

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
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

    public String getTenPbnv() {
        return TenPbnv;
    }

    public void setTenPbnv(String TenPbnv) {
        this.TenPbnv = TenPbnv;
    }

    public String getTenCvnv() {
        return TenCvnv;
    }

    public void setTenCvnv(String TenCvnv) {
        this.TenCvnv = TenCvnv;
    }

    public String getTendanv() {
        return Tendanv;
    }

    public void setTendanv(String Tendanv) {
        this.Tendanv = Tendanv;
    }
    
    
}
