package Day3;

import java.util.Scanner;
import java.util.SortedMap;

public class Example3 {
    /*Tao 1 class HinhChuNhat co 2 thuoc tinh chieuDai: double, chieuRong: double
    * co 2 phuong thuc tinhChuVi(): double va tinhDienTich(): double
    * Tao 2 doi tuong hcn sau do tinh cv,dt*/
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu dai:");
        hcn.chieuDai = in.nextFloat();
        System.out.print("Nhap chieu rong:");
        hcn.chieuRong = in.nextFloat();


        System.out.printf("Chu vi = %f, Dien tich = %f", hcn.tinhChuVi(), hcn.tinhDienTich());

        HinhChuNhat hcn2 = new HinhChuNhat(5,4);
        System.out.printf("Chu vi = %f, Dien tich = %f", hcn2.tinhChuVi(), hcn2.tinhDienTich());
    }
}
