package Exercises2;

import java.util.Scanner;

/*140.Hãy tìm “giá trị dương nhỏ nhất” trong mảng các số thực
(duongnhonhat). Nếu mảng không có giá trị dương thì trả về giá trị
không dương là – 1.*/
public class Ex140 {
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
    //Tim gia tri duong dau tien
    public static float fistPlusNumber(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return  arr[i];
            }
        }
        return -1;
    }
    //Tim gia tri duong nho nhat
    public static float minPlusNumber(float[] arr) {
        float min = fistPlusNumber(arr);
        if (min == -1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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
        float min = minPlusNumber(arr);
        System.out.printf("\nGia tri duong nho nhat la: %f", min);
    }
}
