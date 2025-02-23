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
public abstract class Person {
    protected String maDinhDanh;
    protected String hoTen;
    protected ArrayList<BaiBao> danhSanhBB = new ArrayList<>();
    
    public Person(String maDinhDanh, String hoTen){
        this.maDinhDanh = maDinhDanh;
        this.hoTen = hoTen;
    }
    public abstract double tinhTrungBinh();
    public String getMaDinhDanh() {
        return maDinhDanh;
    }
    public void addBB(BaiBao a){
        this.danhSanhBB.add(a);
    }
    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }
    
}
