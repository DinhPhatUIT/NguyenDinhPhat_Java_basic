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
public class Student extends Person{
    public Student(String maDinhDanh, String hoTen){
        super(maDinhDanh, hoTen);
    }
    @Override
    public double tinhTrungBinh(){
        double tongdiem = 0.0;
        for(BaiBao bb : this.danhSanhBB){
            tongdiem += bb.getDiemBaiBao();
        }
        return (this.danhSanhBB.isEmpty()) ? 0 : tongdiem/this.danhSanhBB.size();
    }
}
