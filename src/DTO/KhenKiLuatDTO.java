/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author MI
 */
public class KhenKiLuatDTO {
    private String MaKTKL;
    private  String MaNv;
    private  String Tennvkl;
    private  String HThuc;
    private String Noidung;
    private int Trangthai;

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }
    
    public KhenKiLuatDTO()
    {
        
    }

    public KhenKiLuatDTO(String MaNv, String Tennvkl, String HThuc, String Noidung, int Trangthai) {
        this.MaNv = MaNv;
        this.Tennvkl = Tennvkl;
        this.HThuc = HThuc;
        this.Noidung = Noidung;
        this.Trangthai = Trangthai;
    }
    


    public KhenKiLuatDTO(String MaKTKL, String MaNv, String Tennvkl, String HThuc) {
        this.MaKTKL = MaKTKL;
        this.MaNv = MaNv;
        this.Tennvkl = Tennvkl;
        this.HThuc = HThuc;
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

    public String getHThuc() {
        return HThuc;
    }

    public void setHThuc(String HThuc) {
        this.HThuc = HThuc;
    }

    public String getTennvkl() {
        return Tennvkl;
    }

    public void setTennvkl(String Tennvkl) {
        this.Tennvkl = Tennvkl;
    }

   
}
