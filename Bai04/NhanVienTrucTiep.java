package bai04;
public class NhanVienTrucTiep extends NhanVien {
    private double heSoPhuCap;

    NhanVienTrucTiep(String maNhanVien, String hoTen, String tenDonVi, double mucLuong,double heSoPhuCap  ) {
        super(maNhanVien,hoTen,tenDonVi,mucLuong);
        this.heSoPhuCap = heSoPhuCap;
    }
    @Override
    public double tinhLuongThang(){
        double tongLuong = 0;
        for(NgayLam ds : dsNgayLam){
            tongLuong += mucLuong*ds.getHeSoLamViec();
        }
        return tongLuong*(1+heSoPhuCap);
    }

    public double getHeSoPhuCap() {
        return heSoPhuCap;
    }

    public void setHeSoPhuCap(double heSoPhuCap) {
        this.heSoPhuCap = heSoPhuCap;
    }
}
