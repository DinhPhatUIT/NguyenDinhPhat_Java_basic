package bai04;
import java.util.*;
public class Bai04 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        QLNhanVien ql = new QLNhanVien();
        NhanVienGianTiep a = new NhanVienGianTiep("NV026","Tran X","thu ngan",5000000);
        NhanVienGianTiep b = new NhanVienGianTiep("NV002","Nguyen A","van chuyen",6000000);
        NhanVienTrucTiep c = new NhanVienTrucTiep("NV100","Pham B","thu ngan",10000000,0.15);
        NhanVienTrucTiep d = new NhanVienTrucTiep("NV200","Dinh D","quan ly",12000000,0.2);

        ql.addNhanVien(a);
        ql.addNhanVien(b);
        ql.addNhanVien(c);
        ql.addNhanVien(d);

        ql.ChamCong("Tran X","NV026","23/2/2025",1);

       ql.dsChamCong();

    }
}