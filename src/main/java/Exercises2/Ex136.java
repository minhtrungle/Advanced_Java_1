package Exercises2;

import java.net.InetSocketAddress;
import java.util.Scanner;

/*136.Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên
(chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.*/
public class Ex136 {
    //Nhap mang
    public static void inArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] ", i);
            arr[i] = in.nextInt();
        }
    }
    //Xuat mang
    public static void outArray(int[] arr) {
        System.out.print("Mang so nguyen ban vua nhap");
        for (int array : arr) {
            System.out.print(array + "\t");
        }
    }
    //Tim so chan cuoi cung
    public static int evenNumber(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
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
            System.out.printf("Nhap lai kich thuoc mang");
            System.exit(0);
        }

        int[] A = new int[n];
        inArray(A);
        outArray(A);
        int result = evenNumber(A);
        System.out.printf("So chan cuoi cung la: %d", result);
    }
}
