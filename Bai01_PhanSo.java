/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai01_PhanSo;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai01_PhanSo {
    
    
    private int tuSo, mauSo;
    
    public Bai01_PhanSo(int tuSo, int mauSo){
        if(mauSo == 0){
            throw new IllegalArgumentException("Mau so khong the bang 0");
        }
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }
    public void hienThiPhanSo(){
        rutGon();
        if(this.mauSo == 1)
            System.out.println(this.tuSo);
        else
            System.out.println(this.tuSo + "/" + this.mauSo);
    }
    public int timUCLN(int a, int b){
        while(b != 0){
            int du = a%b;
            a = b;
            b = du;
        }
        return Math.abs(a);
    }
    public void rutGon(){
        int ucln = timUCLN(this.tuSo, this.mauSo);
        this.mauSo /= ucln;
        this.tuSo /= ucln;
        
        if(this.mauSo < 0 ){
            this.mauSo = -this.mauSo;
            this.tuSo = -this.tuSo;
        }
    }
    public Bai01_PhanSo congPhanSo(Bai01_PhanSo a) {
        int tuMoi = this.tuSo * a.mauSo + a.tuSo * this.mauSo;
        int mauMoi = this.mauSo * a.mauSo;
        return new Bai01_PhanSo(tuMoi, mauMoi);
    }

    public Bai01_PhanSo truPhanSo(Bai01_PhanSo a) {
        int tuMoi = this.tuSo * a.mauSo - a.tuSo * this.mauSo;
        int mauMoi = this.mauSo * a.mauSo;
        return new Bai01_PhanSo(tuMoi, mauMoi);
    }

    public Bai01_PhanSo nhanPhanSo(Bai01_PhanSo a) {
        int tuMoi = this.tuSo * a.tuSo;
        int mauMoi = this.mauSo * a.mauSo;
        return new Bai01_PhanSo(tuMoi, mauMoi);
    }

    public Bai01_PhanSo chiaPhanSo(Bai01_PhanSo b) {
        if (b.tuSo == 0) {
            throw new ArithmeticException("Khong the chia cho 0");
        }
        int tuMoi = this.tuSo * b.mauSo;
        int mauMoi = this.mauSo * b.tuSo;
        return new Bai01_PhanSo(tuMoi, mauMoi);
    }
    //so sanh 2 phan so return 1 neu >, 0 neu =, -1 neu <
    public int sosanhPhanSo(Bai01_PhanSo a){
        int tusoThis = this.tuSo * a.mauSo;
        int tuSo_a = a.tuSo * this.mauSo;
        if(tusoThis > tuSo_a){
            return 1;
        }
        else if(tusoThis == tuSo_a){
            return 0;
        }
        else
            return -1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z,t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan so thu 1:");
        System.out.print("Nhap tu so: ");
        x = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        y = scanner.nextInt();
        Bai01_PhanSo a = new Bai01_PhanSo(x,y);
        System.out.println("Nhap phan so thu 2:");
        System.out.print("Nhap tu so: ");
        z = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        t = scanner.nextInt();
        Bai01_PhanSo b = new Bai01_PhanSo(z,t);
        Bai01_PhanSo c = a.nhanBai01_PhanSo(b);
        Bai01_PhanSo d = a.chiaBai01_PhanSo(b);
        Bai01_PhanSo e = a.congBai01_PhanSo(b);
        Bai01_PhanSo f = a.truBai01_PhanSo(b);
        System.out.print("Tich hai phan so la: ");
        c.hienThiPhanSo();
        System.out.print("Thuong hai phan so la: ");
        d.hienThiPhanSo();
        System.out.print("Tong hai phan so la: ");
        e.hienThiPhanSo();
        System.out.print("Hieu hai phan so la: ");
        f.hienThiPhanSo();
        System.out.print("So sanh hai phan so: ");
        int cp = a.sosanhPhanSo(b);
        if(cp == 1) System.out.print("Phan so a > Phan so b");
        else if(cp == 0) System.out.print("Phan so a = Phan so b");
        else System.out.print("Phan so a < Phan so b");
              
    }
    
}
