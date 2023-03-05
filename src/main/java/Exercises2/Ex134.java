package Exercises2;

import java.util.Scanner;

/*134.Viết hàm tìm “giá trị lớn nhất” trong mảng một chiều số thực (lonnhat)*/
public class Ex134 {
    //Nhap mang
    public static void inArray(float[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextFloat();
        }
    }
    //Xuat mang
    public static void outArray(float[] arr) {
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //Tim gia tri lon nhat
    public static float maxArray(float[] arr) {
        float max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        while (n <= 0) {
            System.out.print("Moi nhap lai mang");
        }

        float[] arr = new float[n];
        inArray(arr);
        outArray(arr);
        float max = maxArray(arr);
        System.out.printf("\nGia tri lon nhat la: %f", max);
    }
}
