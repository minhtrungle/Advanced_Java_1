package Day3;

import java.util.Scanner;

/*Nhập vao 1 mang cac hình chũ nhật , in ra hình có diện tích lớn nhất*/
public class Ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = in.nextInt();
        //Khai bao mang
        HinhChuNhat[] arr = new HinhChuNhat[n];

        double chieuDai = 0;
        double chieuRong = 0;
        for (int i = 0; i < arr.length; i++) {
            // Nhap chi tiet cho arr[i]
            System.out.println("Hinh chu nhat thu " + i);
            System.out.print("Chieu dai: ");
            chieuDai = in.nextDouble();
            System.out.print("Chieu rong: ");
            chieuRong = in.nextDouble();
            //Tao doi tuong hinh chu nhat o vi tri index i
            arr[i] = new HinhChuNhat(chieuDai, chieuRong);

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }
        //in ra hcn co dt lon nhat
        double max = arr[0].tinhDienTich();
        int vtMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i].tinhDienTich()) {
                max = arr[i].tinhDienTich();
                vtMax = i;
            }
        }
        System.out.println(arr[vtMax].toString());
        System.out.printf("Hinh co dien tich max la: %d", vtMax);
    }
}
