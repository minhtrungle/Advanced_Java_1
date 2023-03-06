package Day3;

public class HinhTron {
    double banKinh;
//    public HinhTron() {
//
//    } Xóa đi để khởi tạo có bán kính
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public double tinhChuVi() {
        return 2 * banKinh * Math.PI;
    }
    public double tinhDienTich() {
        return banKinh * banKinh * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
