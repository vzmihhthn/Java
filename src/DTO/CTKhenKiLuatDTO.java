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
public class CTKhenKiLuatDTO {
    private String MaKTKL;
    private String MaNv;
    private double Sotien;
    private Date Ngayquyetdinh;
    private String Hinhthuc;
    private String Noidung;
    public CTKhenKiLuatDTO()
    {
        
    }
    public CTKhenKiLuatDTO(String MaKTKL, String MaNv, double Sotien, Date Ngayquyetdinh, String Hinhthuc, String Noidung) {
        this.MaKTKL = MaKTKL;
        this.MaNv = MaNv;
        this.Sotien = Sotien;
        this.Ngayquyetdinh = Ngayquyetdinh;
        this.Hinhthuc = Hinhthuc;
        this.Noidung = Noidung;
    }

    public String getMaKTKL() {
        return MaKTKL;
    }

    public void setMaKTKL(String MaKTKL) {
        this.MaKTKL = MaKTKL;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public double getSotien() {
        return Sotien;
    }

    public void setSotien(double Sotien) {
        this.Sotien = Sotien;
    }

    public Date getNgayquyetdinh() {
        return Ngayquyetdinh;
    }

    public void setNgayquyetdinh(Date Ngayquyetdinh) {
        this.Ngayquyetdinh = Ngayquyetdinh;
    }

    public String getHinhthuc() {
        return Hinhthuc;
    }

    public void setHinhthuc(String Hinhthuc) {
        this.Hinhthuc = Hinhthuc;
    }

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }
    
    
}
