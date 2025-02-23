package bai04;
public class NgayLam {
    private String ngay;
    private double heSoLamViec;

    NgayLam(String ngay, double heSoLamViec) {
        this.ngay = ngay;
        this.heSoLamViec = heSoLamViec;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getHeSoLamViec() {
        return heSoLamViec;
    }

    public void setHeSoLamViec(double heSoLamViec) {
        this.heSoLamViec = heSoLamViec;
    }
}
