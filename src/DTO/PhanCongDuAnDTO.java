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
public class PhanCongDuAnDTO {
    
    private String Manv;
    private String Tennvda;
    private String Tennvpb;
    private String Tencvda;
    private Date   Ngaybd;
    private Date Ngaykt;
    private String Tenda;
    private String GhiChu;
    private int Trangthai;
    public PhanCongDuAnDTO()
    {
        
    }
//
//    public PhanCongDuAnDTO(String Manv, String Tennvda, String Tennvpb, String Tencvda, 
//            Date Ngaybd, Date Ngaykt, String Tenda, String GhiChu) {
//        this.Manv = Manv;
//        this.Tennvda = Tennvda;
//        this.Tennvpb = Tennvpb;
//        this.Tencvda = Tencvda;
//        this.Ngaybd = Ngaybd;
//        this.Ngaykt = Ngaykt;
//        this.Tenda = Tenda;
//        this.GhiChu = GhiChu;
//    }

    public PhanCongDuAnDTO(String Manv, String Tennvda, String Tennvpb, String Tencvda, 
            Date Ngaybd, Date Ngaykt, String Tenda, String GhiChu, int Trangthai) {
        this.Manv = Manv;
        this.Tennvda = Tennvda;
        this.Tennvpb = Tennvpb;
        this.Tencvda = Tencvda;
        this.Ngaybd = Ngaybd;
        this.Ngaykt = Ngaykt;
        this.Tenda = Tenda;
        this.GhiChu = GhiChu;
        this.Trangthai = Trangthai;
    }
    

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }
    
    public String getTennvpb() {
        return Tennvpb;
    }

    public void setTennvpb(String Tennvpb) {
        this.Tennvpb = Tennvpb;
    }





    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTennvda() {
        return Tennvda;
    }

    public void setTennvda(String Tennvda) {
        this.Tennvda = Tennvda;
    }

    public String getTencvda() {
        return Tencvda;
    }

    public void setTencvda(String Tencvda) {
        this.Tencvda = Tencvda;
    }

    public String getTenda() {
        return Tenda;
    }

    public void setTenda(String Tenda) {
        this.Tenda = Tenda;
    }

    public Date getNgaybd() {
        return Ngaybd;
    }

    public void setNgaybd(Date Ngaybd) {
        this.Ngaybd = Ngaybd;
    }

    public Date getNgaykt() {
        return Ngaykt;
    }

    public void setNgaykt(Date Ngaykt) {
        this.Ngaykt = Ngaykt;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
