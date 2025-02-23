package bai04;
import java.util.ArrayList;
import java.util.*;
public class QLNhanVien {
    private ArrayList<NhanVien> dsNhanVien;
    public QLNhanVien() {
        this.dsNhanVien = new ArrayList<>();
    }
    public QLNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }
    public void addNhanVien(NhanVien nhanVien) {
        this.dsNhanVien.add(nhanVien);
    }
    public void ChamCong(String hoTen, String maNhanVien, String ngayChamCong, double heSoLamViec) {
            for(NhanVien nv : dsNhanVien) {
                if(nv.getMaNhanVien().equals(maNhanVien)) {
                    nv.dsNgayLam.add(new NgayLam(ngayChamCong, heSoLamViec));
                }
            }
    }
    public void dsChamCong(){
        for(NhanVien nv : dsNhanVien) {
            System.out.println("Ma nhan vien " + nv.getMaNhanVien()+" Ho ten: "+nv.getHoTen() + " So ngay lam viec: "+nv.soNgayLamViec()+" Luong: "+nv.tinhLuongThang());
        }
    }
}
