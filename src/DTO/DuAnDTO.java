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
public class DuAnDTO {
    private String MaDA;
    private String MaNv;  
    private String TenDA;
    private Date NgayBD;
    private Date NgayKT;
    private String Ghichu;
    private int Trangthai;
    public DuAnDTO()
    {
        
    }

    public DuAnDTO(String MaDA, String MaNv, String TenDA, Date NgayBD, Date NgayKT, String Ghichu) {
        this.MaDA = MaDA;
        this.MaNv = MaNv;
        this.TenDA = TenDA;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.Ghichu = Ghichu;
    }
    
    public DuAnDTO(String MaDA, String MaNv, String TenDA, Date NgayBD, 
            Date NgayKT, String Ghichu, int Trangthai) {
        this.MaDA = MaDA;
        this.MaNv = MaNv;
        this.TenDA = TenDA;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.Ghichu = Ghichu;
        this.Trangthai = Trangthai;
    }
    
    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }


    public String getMaDA() {
        return MaDA;
    }

    public void setMaDA(String MaDA) {
        this.MaDA = MaDA;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenDA() {
        return TenDA;
    }

    public void setTenDA(String TenDA) {
        this.TenDA = TenDA;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }
    
    

    
}
