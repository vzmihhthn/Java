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
public class CTKhenKiLuatDTO 
{
    private String MaCTKTKL;
    private String MaKTKL;
    private String MaNv;
    private String Tennvct;
    private float Sotien;
    private Date Ngayquyetdinh;
    private String Hinhthuc;
    private String Noidung;
    private int Trangthai;
    public CTKhenKiLuatDTO()
    {
        
    }

    public CTKhenKiLuatDTO(String MaNv, String Tennvct, float Sotien, Date Ngayquyetdinh, String Hinhthuc, String Noidung, int Trangthai) {
        this.MaNv = MaNv;
        this.Tennvct = Tennvct;
        this.Sotien = Sotien;
        this.Ngayquyetdinh = Ngayquyetdinh;
        this.Hinhthuc = Hinhthuc;
        this.Noidung = Noidung;
        this.Trangthai = Trangthai;
    }


    public CTKhenKiLuatDTO(String MaCTKTKL, String MaKTKL, String MaNv, String Tennvct, float Sotien, Date Ngayquyetdinh, String Hinhthuc, String Noidung) {
        this.MaCTKTKL = MaCTKTKL;
        this.MaKTKL = MaKTKL;
        this.MaNv = MaNv;
        this.Tennvct = Tennvct;
        this.Sotien = Sotien;
        this.Ngayquyetdinh = Ngayquyetdinh;
        this.Hinhthuc = Hinhthuc;
        this.Noidung = Noidung;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }
    
    public String getMaCTKTKL() {
        return MaCTKTKL;
    }

    public void setMaCTKTKL(String MaCTKTKL) {
        this.MaCTKTKL = MaCTKTKL;
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

    public String getTennvct() {
        return Tennvct;
    }

    public void setTennvct(String Tennvct) {
        this.Tennvct = Tennvct;
    }

    public float getSotien() {
        return Sotien;
    }

    public void setSotien(float Sotien) {
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
