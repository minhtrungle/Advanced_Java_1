package Day5.TruuTuong1;

public class HinhLucGiacDeu extends HinhHoc{
    private double canhLG = 1.0;

    public HinhLucGiacDeu() {
    }

    public HinhLucGiacDeu(double canhLG) {
        if (canhLG <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.canhLG = canhLG;
    }

    public HinhLucGiacDeu(String mauSac, double canhLG) {
        super(mauSac);
        if (canhLG <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.canhLG = canhLG;
    }

    public double getCanhLG() {
        return canhLG;
    }

    public void setCanhLG(double canhLG) {
        if (canhLG <= 0) {
            throw new RuntimeException("Khong thoa man");
        }
        this.canhLG = canhLG;
    }
    @Override
    public double tinhChuVi() {
        return 6 * canhLG;
    }

    @Override
    public double tinhDienTich() {
        return (Math.pow(3,3/2) * canhLG * canhLG)/2 ;
    }
}
