/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Teacher extends Person{
    private String hocHam;
    private double heSo;
    
    public Teacher(String maDinhDanh, String hoTen, String hocHam){
        super(maDinhDanh, hoTen);
        this.hocHam = hocHam;
        switch(hocHam){
            case "GS": this.heSo = 0.1; break;
            case "PGS": this.heSo = 0.15; break;
            case "GVC": this.heSo = 0.2; break;
            case "TS": this.heSo = 0.25; break;
            case "ThS": this.heSo = 0.3; break;
            default: this.heSo = 0.0; break;
        }
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }
    
    @Override
    public double tinhTrungBinh(){
        double tongdiem = 0.0;
        for(BaiBao bb : this.danhSanhBB){
            tongdiem += bb.getDiemBaiBao();
        }
        return (this.danhSanhBB.isEmpty()) ? 0 : tongdiem/this.danhSanhBB.size()*heSo;
    }
}

