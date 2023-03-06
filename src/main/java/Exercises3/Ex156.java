package Exercises3;

import java.util.Scanner;

/*156.Hãy tìm một vị trí trong mảng một chiều các số thực mà giá trị tại vị trí
đó là giá trị “gần giá trị x nhất”.*/
public class Ex156 {
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
    //Tim gia tri trong mang gan gia tri x nhat
    public static double nearNumberX(double[] arr, double x) {
        double result = 0;
        double nearNum = arr[0];

        int temp = (int)Math.abs(nearNum - x);
        for (int i = 0; i < arr.length; i++) {
            if (nearNum > (int)Math.abs(arr[i]- x)) {
                nearNum = (int)Math.abs(arr[i]- x);
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
            double result = nearNumberX(arr, x);
            System.out.printf("\nGia tri trong mang gan gia tri x nhat la: %f", result);

        } catch (Exception e) {
            System.out.println("Exception:");
        }
    }
}
