package Exercises2;

import java.util.Scanner;
/*135.Tìm “giá trị dương đầu tiên” trong mảng một chiều các số thực
(duongdau). Nếu mảng không có giá trị dương thì trả về giá trị -1.*/
public class Ex135 {
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
    public static float plusArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
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

        float result = plusArray(arr);
        System.out.printf("\nGia tri duong dau tien la: %f", result);
    }
}
