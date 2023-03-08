package Day5.TruuTuong1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setBanKinh(4);
        ht.setMauSac("blue");
        System.out.println(ht);
        double a = ht.tinhChuVi();
        double b = ht.tinhDienTich();
        System.out.printf("Chu vi la: %.3f va Dien tich la: %.3f", a, b);

        HinhVuong hv = new HinhVuong("red",3);
        System.out.println("\n"+ hv);
        double c = hv.tinhChuVi();
        double d = hv.tinhDienTich();
        System.out.printf("\nChu vi la: %.2f va Dien tich la: %.2f", c, d);

//        Scanner in = new Scanner(System.in);
//        System.out.printf("Nhap n");
//        int n = in.nextInt();
//
//        HinhTron[] arr = new HinhTron[n];
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Ban kinh arr[%d] = ", i);
//            ht.setBanKinh(in.nextDouble());
//            arr[i] = new HinhTron();
//        }
//        HinhTron max = arr[0].tinhDienTich();
//        int vtMax = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//        }
        HinhHoc[] arr = new HinhHoc[4];
        arr[0] = new HinhTron(3);
        arr[1] = new HinhVuong(5);
        arr[2] = new HinhTron(6);
        arr[3] = new HinhLucGiacDeu(7);

        HinhHoc hinhHocMax = null;
        double dtMax = 0;
        for (HinhHoc h: arr) {
            if (h.tinhDienTich() > dtMax) {
                dtMax = h.tinhDienTich();
                hinhHocMax = h;
            }
        }
        System.out.println("Hinh co dien tich lon nhat: ");
        System.out.println(hinhHocMax);

     }
}
