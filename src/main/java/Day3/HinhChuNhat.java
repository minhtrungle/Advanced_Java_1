package Day3;

public class HinhChuNhat {
    double chieuDai;
    double chieuRong;
    //Contructor - phuong thuc khoi tao
    public HinhChuNhat() {

    }
    public HinhChuNhat( double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai; //this tro len khoi tao chieuDai o tren dau tien
        this.chieuRong = chieuRong;
    }
    public double tinhChuVi() { //public ve lop khong phai doi tuong
        return (chieuDai + chieuRong) * 2;
    }
    public double tinhDienTich() { //public ve lop khong phai doi tuong
        return (chieuDai * chieuRong) ;
    }

    //Alt +insert

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
