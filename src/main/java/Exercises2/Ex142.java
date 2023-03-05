package Exercises2;

import java.util.Scanner;

/*142.Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực (nhonhat).
 */
public class Ex142 {
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
    //Tim gia tri nho nhat
    public static float minArray(float[] arr) {
        float min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return  min;
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
        float min = minArray(arr);
        System.out.printf("\nGia tri nho nhat la: %f", min);
    }
}
