package Day4.donggoi1;
/*BT1. Tạo 1 class HinhChuNhat có 2 thuộc
tính chiều dài và chiều rộng. (private)

- Giá trị mặc định = 1.0 ( >= 0)
+ Có 2 phương thức khơi tạo, mặc định
và đầy đủ tham số.
+ Setter, getter cho từng thuộc tính.
+ chuVi()
+ dienTich()

- Viết chương trình thử nghiệm, tạo 2 đối
tượng và tính toán.
+ TestCase1: chieuDai = 0, chieuRong = 4 -> tính cv, dt
+ TestCase2: chieuDai = 1.5, chieuRong = 3 -> tinh cv, dt*/
public class HinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public HinhChuNhat() {
    }
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai >= 0) {
            this.chieuDai = chieuDai;
        } else {
            System.out.print("Chieu dai khong thoa man");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong >= 0) {
            this.chieuRong = chieuRong;
        } else {
            System.out.print("Chieu rong khong thoa man");
        }
    }
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }
    public double dienTich() {
        return chieuDai * chieuRong;
    }
    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
