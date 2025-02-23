package bai04;
import java.util.Array;

import java.util.*;
public abstract class NhanVien {
    protected String maNhanVien;
    protected String hoTen;
    protected String tenDonVi;
    protected double mucLuong;
    protected ArrayList<NgayLam> dsNgayLam = new ArrayList<>();
   // protected double heSo;
    NhanVien(){
        this.dsNgayLam = new ArrayList<>();
    }
    NhanVien(String maNhanVien, String hoTen, String tenDonVi, double mucLuong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tenDonVi = tenDonVi;
        this.mucLuong = mucLuong;
    }
    public abstract double tinhLuongThang();

    public String getMaNhanVien() {
        return maNhanVien;
    }
    public int soNgayLamViec(){
        return dsNgayLam.size();
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
