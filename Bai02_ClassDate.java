/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02_ClassDate;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai02_ClassDate {
    Scanner sc = new Scanner(System.in);
    private int day, month, year;
    public Bai02_ClassDate(){};
    public Bai02_ClassDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // nhap theo dinh dang dd-mm-yyyy
    public void input(){
        System.out.print("Nhap ngay: ");
        this.day = sc.nextInt();
        System.out.print("Nhap thang: ");
        this.month = sc.nextInt();
        System.out.print("Nhap nam: ");
        this.year = sc.nextInt();           
    }
    public boolean checkNamNhuan(){
        if(this.year % 4 == 0){
            if(this.year % 100 == 0){
                if(this.year % 400 == 0){
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else{
            return false;
        }
    }
    public boolean checkDateTrue(){
        if(this.year <= 0) return false;
        if(this.month < 1 || this.month > 12) return false;
        if(this.day < 1) return false;
        
        if(checkNamNhuan() == true){
            if(this.day > 29 && this.month == 2)
                return false;
        }
        else{
            if(this.day > 28 && this.month == 2)
                return false;
        }
        if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7
                || this.month == 8 || this.month == 10 || this.month == 12){
            
                if(this.day > 31)
                    return false;
        }
        else{
             if(this.day > 30)
                 return false;
                }
        return true;
    }
    public void printDate(){
        int x;// x = 1 in theo dinh dang "yyyy-mm-dd", x = 2 in theo dinh dang "mm-dd-yyyy"
        System.out.print("chon 1 de xuat theo sinh dang \"yyyy-mm-dd\", chon 2 de xuat theo dinh dang \"mm-dd-yyyy\"");
        while(true){
            x = sc.nextInt();
            if(x == 1){
                System.out.println(this.year+"-"+this.month+"-"+this.day);
                break;
            }
            else if(x == 2){
                System.out.println(this.month+"-"+this.day+"-"+this.year);
                break;
            }
            else{
                System.out.print("nhap lua chon sai, chi nhap 1 hoac 2, nhap lai:");
            }
        }
    }
    public void printDateNormal(){
        System.out.print(this.day+"-"+this.month+"-"+this.year);
    }
    public Bai02_ClassDate tangSoNgay(int x){
        this.day += x;
        if(this.day < 29)
            return this;
        if(this.month == 2){
            if(checkNamNhuan() == true && this.day > 29){
                this.day %= 29;
                this.month += 1;
            }
            else if(checkNamNhuan() == false && this.day > 28){
                this.day %= 28;
                this.month += 1;
            }
        }
        else if(this.month == 12){
            if(this.day > 31){
                this.day %= 31;
                this.month = 1;
                this.year += 1;
            }
        }
        else if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7
                || this.month == 8 || this.month == 10){
            
                if(this.day > 31)
                {
                    this.day %= 31;
                    this.month += 1;
                }
        }
        else{
            if(this.day > 30){
                this.day %= 30;
                this.month += 1;
            }
        }
        return this;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       //int x, y, z;
        System.out.println("Nhap ngay thang nam:");
        Bai02_ClassDate date = new Bai02_ClassDate();
        while(true){
            date.input();
            if(date.checkDateTrue() == false){
                System.out.println("Ngay thang nam khong hop le, nhap lai:");
            }
            else
                break;
        }
        System.out.println("Hien thi ngay thang nam:");
        date.printDate();
        int x;
        System.out.print("Nhap so ngay muon cong them: ");
        x = sc.nextInt();
        date = date.tangSoNgay(x);
        date.printDateNormal();
        
    }
    
}
