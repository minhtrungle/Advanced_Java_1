package Day5.TruuTuong1;

public class HinhVuong extends HinhHoc{
    private double canh = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.canh = canh;
    }

    public HinhVuong(String mauSac, double canh) {
        super(mauSac);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                ", mauSac='" + super.toString() + '\'' +
                '}';
    }
}
