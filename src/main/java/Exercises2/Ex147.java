package Exercises2;

import java.util.Scanner;

/*Tìm “số dương cuối cùng” trong mảng số thực (duongcuoi). Nếu mảng
không có giá trị dương thì trả về giá trị - 1.*/
public class Ex147 {
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
    //Tim gia tri duong cuoi cung
    public static float lastPlusNumber(float[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                return arr[i];
            }
        }
        return -1;
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

        float result = lastPlusNumber(arr);
        System.out.printf("\nGia tri duong dau tien la: %f", result);
    }
}
