/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author MI
 */
public class BangLuongDTO {
     private String MaNv;
    private String MaLuong;
    private String TenNv;
    private float LuongCoBan;
    private float HeSoluong;
    private float ThuongPhat;
    private float TienLuong;
    private float TienPhuCap;
    
    public  BangLuongDTO()
    {
        
    }

    public BangLuongDTO(String MaNv, String MaLuong, String TenNv, float LuongCoBan, float HeSoluong, float ThuongPhat, float TienLuong, float TienPhuCap) {
        this.MaNv = MaNv;
        this.MaLuong = MaLuong;
        this.TenNv = TenNv;
        this.LuongCoBan = LuongCoBan;
        this.HeSoluong = HeSoluong;
        this.ThuongPhat = ThuongPhat;
        this.TienLuong = TienLuong;
        this.TienPhuCap = TienPhuCap;
    }

    public BangLuongDTO(String MaLuong, String TenNv, float LuongCoBan, float HeSoluong, float ThuongPhat, float TienLuong, float TienPhuCap) {
        this.MaLuong = MaLuong;
        this.TenNv = TenNv;
        this.LuongCoBan = LuongCoBan;
        this.HeSoluong = HeSoluong;
        this.ThuongPhat = ThuongPhat;
        this.TienLuong = TienLuong;
        this.TienPhuCap = TienPhuCap;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public float getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(float LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public float getHeSoluong() {
        return HeSoluong;
    }

    public void setHeSoluong(float HeSoluong) {
        this.HeSoluong = HeSoluong;
    }

    public float getThuongPhat() {
        return ThuongPhat;
    }

    public void setThuongPhat(float ThuongPhat) {
        this.ThuongPhat = ThuongPhat;
    }

    public float getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(float TienLuong) {
        this.TienLuong = TienLuong;
    }

    public float getTienPhuCap() {
        return TienPhuCap;
    }

    public void setTienPhuCap(float TienPhuCap) {
        this.TienPhuCap = TienPhuCap;
    }
    
}
