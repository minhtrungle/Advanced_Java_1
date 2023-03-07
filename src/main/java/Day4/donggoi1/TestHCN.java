package Day4.donggoi1;

public class TestHCN {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai(0);
        hcn.setChieuRong(4);
        System.out.println(hcn.chuVi());
        System.out.println(hcn.dienTich());
    }
}
