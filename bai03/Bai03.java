/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai03;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLBaiBao bb = new QLBaiBao();
        Student a =  new Student("SV002","N V A");
        Student b = new Student("SV026","Le D");
        
        Teacher c = new Teacher("GV001","Nguyen Van B","GS");
        Teacher d = new Teacher("GV002","Nguyen Van C","PhD");
        Teacher e= new Teacher("GV003","Nguyen Van D","TS");
        
        bb.themNguoi(a);
        bb.themNguoi(b);
        bb.themNguoi(c);
        bb.themNguoi(d);
        bb.themNguoi(e);
        
       bb.themBBChoSV("SV026", "A");
        bb.dsKhenThuong();
    }
    
}
