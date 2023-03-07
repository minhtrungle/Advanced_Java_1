package Day4.kethua;

public class HinhVuong extends HinhChuNhat {
    private double canhHV = 1.0;

    public HinhVuong() {

    }
    public HinhVuong(double canhHV) {
        super(canhHV, canhHV);
        this.canhHV = canhHV;
    }

    public double getCanhHV() {
        return canhHV;
    }

    public void setCanhHV(double canhHV) {
        if (canhHV <= 0) {
            throw new RuntimeException("Canh phai so duong");
        }
        this.canhHV = canhHV;
        super.setChieuDai(canhHV);
        super.setChieuRong(canhHV);
    }
    //Tính đa hình sử dụng ghì đè
    @Override
    public void setChieuDai(double canhHV) {
        super.setChieuDai(canhHV);
        super.setChieuRong(canhHV);
    }

    @Override
    public void setChieuRong(double canhHV) {
        super.setChieuDai(canhHV);
        super.setChieuRong(canhHV);
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canhHV=" + canhHV +
                '}';
    }
}
