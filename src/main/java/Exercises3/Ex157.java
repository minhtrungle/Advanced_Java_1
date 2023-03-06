package Exercises3;

import java.util.Scanner;

/*157.Cho mảng một chiều các số thực, hãy tìm đoạn [a,b] sao cho đoạn này
chứa tất cả các giá trị trong mảng (timdoan).*/
public class Ex157 {
    //Nhap mang
    public static void inArray(double[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextFloat();
        }
    }
    //Xuat mang
    public static void outArray(double[] arr) {
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //Tim doan a,b chua tat ca cac gia tri trong mang la doan tu so be nhat den so lon nhat
    public static void findPara(double[] arr) {
        // gan doan a;b la gia tru dau tien
        double a = arr[0];
        double b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( a > arr[i] ) {
                a = (int)arr[i];
            }
            if (b < arr[i]) {
                b = (int)arr[i];
            }
        }
        System.out.printf("\nDoan chua cac gia tri trong mang la: [%f; %f]", a, b);
    }
    public static void main(String[] args) throws Exception {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Nhap kich thuoc mang vao:");
            int n = in.nextInt();


            if (n <= 1) {
                System.out.print("Mang khong hop le");
                System.exit(0);
            }
            double[] arr = new double[n];
            inArray(arr);
            outArray(arr);
            findPara(arr);
            //System.out.printf("\nDoan [a,b] chua tat ca cac gia tri trong mang la: %f", result);

        } catch (Exception e) {
            System.out.println("Exception:");
        }
    }
}
