package Day4.KeThua_Ex1;

public class KyThuat extends NhanVien{

    private String chuyenNghanh;

    public KyThuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String address, String chuyenNghanh) {
        super(maNhanVien, hoTen, namSinh, address);
        this.chuyenNghanh = chuyenNghanh;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    @Override
    public String moTaCongViec() {
        return "Hỗ trợ kỹ thuật trong công ty";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                ", chuyenNghanh='" + chuyenNghanh + '\'' +
                ']';
    }
}
