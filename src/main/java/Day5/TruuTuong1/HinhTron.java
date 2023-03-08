package Day5.TruuTuong1;

import Day5.TruuTuong.Main;

public class HinhTron extends HinhHoc {
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.banKinh = banKinh;
    }

    public HinhTron(String mauSac, double banKinh) {
        super(mauSac);
        if (banKinh <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * banKinh * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return banKinh * banKinh * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ", mauSac='" + super.toString() + '\'' +
                '}';
    }
}
