package Day4.donggoi1;

public class HinhTron {
    double banKinh = 1.0;

    public HinhTron() {
    }
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            System.out.print("Khong thoa man");
        }
    }
    public double chuVi(){
        return Math.PI * banKinh * 2;
    }

    public double dienTich(){
        return Math.PI * banKinh * banKinh;
    }
    @Override
    public String toString() {
        return "HinhTron{}";
    }

}
