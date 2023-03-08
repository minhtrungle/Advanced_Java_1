package Day5.TruuTuong1;

public abstract class HinhHoc {
    private String mauSac;

    public HinhHoc() {
    }

    public HinhHoc(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return "HinhHoc{" +
                "mauSac='" + mauSac + '\'' +
                '}';
    }
}
