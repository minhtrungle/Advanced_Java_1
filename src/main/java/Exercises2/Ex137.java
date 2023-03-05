package Exercises2;

import java.util.Scanner;

/*137.Tìm “một vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất” trong mảng
một chiều các số thực (vitrinhonhat).*/
public class Ex137 {
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
        System.out.print("Mang so thuc vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //Tim vi tri co gia tri nho nhat
    public static float minLocation(float[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                arr[index] = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        while (n < 1) {
            System.out.print("Mang nhap khong hop le");
        }

        float[] arr = new float[n];
        inArray(arr);
        outArray(arr);
        float min = minLocation(arr);
        System.out.printf("\nVi tri co gia tri nho nhat la: %f", min);
    }
}
