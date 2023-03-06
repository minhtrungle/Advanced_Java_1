package Exercises3;

import java.io.IOException;
import java.util.Scanner;

/*155.Hãy tìm giá trị trong mảng các sô thực “xa giá trị x nhất” (xanhat).*/
public class Ex155 {
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
    // Gia tri trong mang xa gia tri x nhat
    public static double longNumberX(double[] arr, double x) {
        double result = 0;
        double longNum = arr[0]; //Cho gia tri gan x nhat la gia dau tien

        int temp = (int)Math.abs(longNum - x);
        for ( int i = 0; i < arr.length; i++) {
            if (temp < Math.abs(arr[i] - x)) {
                temp = (int)Math.abs(arr[i] - x);
                result = arr[i];
            }
        }
        return result;
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
            double x = 15;
            double[] arr = new double[n];
            inArray(arr);
            outArray(arr);
            double result = longNumberX(arr, x);
            System.out.printf("\nGia tri trong mang xa gia tri x nhat la: %f", result);

        } catch (Exception e) {
            System.out.println("Exception:");
        }
    }
}
