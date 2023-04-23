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
    public String MaKTKL;
    public String MaNv;
    public KhenKiLuatDTO()
    {
        
    }

    public KhenKiLuatDTO(String MaKTKL, String MaNv) {
        this.MaKTKL = MaKTKL;
        this.MaNv = MaNv;
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
    
}
