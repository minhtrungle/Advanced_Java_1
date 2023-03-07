package Day4.kethua;

import Day4.donggoi.Student;

public class Test {
    public static void main(String[] args) {
//        Student s2 = new Student();
//        // s2.id, s2.name => ko the truy cap do nam ngoai package
//        s2.age = 21;
        HinhChuNhat hcn = new HinhChuNhat(2, 3);
        System.out.println(hcn);
        hcn.setChieuDai(3);
        hcn.setChieuRong(7);
        System.out.println(hcn);
        double a = hcn.tinhChuVi();
        double b = hcn.tinhDienTich();
        hcn.tinhDienTich();
        System.out.printf("Chu vi la: %f va dien tich la: %f",a, b);

        HinhVuong hv = new HinhVuong(4);
        System.out.println(hv);
        hv.setCanhHV(2);
        hv.setChieuRong(6);
        hv.setChieuDai(5);
        System.out.println(hv);

        double c = hv.tinhChuVi();
        double d = hv.tinhDienTich();
        hcn.tinhDienTich();
        System.out.printf("Chu vi la: %f va dien tich la: %f", c, d);
        //Dạng này không nên dùng kế thừa, nên sử dụng trừu tượng
    }
}
