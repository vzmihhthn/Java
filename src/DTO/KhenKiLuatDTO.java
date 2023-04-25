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
    public String Tennvkl;
    public String HThuc;

    public KhenKiLuatDTO()
    {
        
    }

    public KhenKiLuatDTO(String MaNv, String Tennvkl, String HThuc) {
        this.MaNv = MaNv;
        this.Tennvkl = Tennvkl;
        this.HThuc = HThuc;
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
