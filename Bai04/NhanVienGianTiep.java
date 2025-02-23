package bai04;
public class NhanVienGianTiep extends NhanVien {

    NhanVienGianTiep(String maNhanVien, String hoTen, String tenDonVi, double mucLuong ) {
        super(maNhanVien,hoTen,tenDonVi,mucLuong);
    }
    @Override
    public double tinhLuongThang(){
        double tongLuong = 0;
        for(NgayLam ds : dsNgayLam){
            tongLuong += mucLuong*ds.getHeSoLamViec();
        }
        return tongLuong;
    }
}
