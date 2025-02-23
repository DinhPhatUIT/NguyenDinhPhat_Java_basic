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
public class QLBaiBao {
    private ArrayList<Person> dsNguoi;
    
    public QLBaiBao(){
        this.dsNguoi = new ArrayList<>();
    }
    public void themNguoi(Person a){
        this.dsNguoi.add(a);
    }
    //cau 2a them bai bao loai A cho sv Le D, mssv SV0226
    public void themBBChoSV(String maDinhDanh, String loaiBB){
        for(Person bb:this.dsNguoi){
            if(bb instanceof Student){
                if(bb.maDinhDanh.equals(maDinhDanh)){
                    bb.addBB(new BaiBao(loaiBB));
                    return;
                }
            }
        }
    }
    public void themBBChoGV(String maDinhDanh, String loaiBB){
        for(Person bb:this.dsNguoi){
            if(bb instanceof Teacher){
                if(bb.maDinhDanh.equals(maDinhDanh)){
                    bb.addBB(new BaiBao(loaiBB));
                    return;
                }
            }
        }
    }
    public void dsKhenThuong(){
        System.out.println("Danh sach khen thuong: ");
        for(Person pr : this.dsNguoi){
            if(pr instanceof Teacher && pr.tinhTrungBinh() > 0.85){
                System.out.print(" Ma GV: "+pr.getMaDinhDanh() +" Ten GV: "+ pr.hoTen+ 
                        " So luong bai bao: " + pr.danhSanhBB.size()+" diem trung binh: "+ pr.tinhTrungBinh());
            }
            if(pr instanceof Student && pr.tinhTrungBinh() > 7.0){
                System.out.print("Ma SV: "+ pr.getMaDinhDanh()+ " Ten SV: "+ pr.hoTen+ 
                        " So luong bai bao: " + pr.danhSanhBB.size()+ " diem trung binh: "+ pr.tinhTrungBinh());
            }
        }
    }
    
}
