package Exercises2;

import java.io.IOException;
import java.util.Scanner;

/*148.Tìm “số nguyên tố cuối cùng” trong mảng một chiều các số nguyên
(nguyentocuoi). Nếu mảng không có số nguyên tố thì trả về giá trị -1.*/
public class Ex148 {
    //Nhap mang
    public static void inArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextInt();
        }
    }
    //Xuat mang
    public static void outArray(int[] arr) {
        System.out.print("Mang so nguyen vua nhap la:");
        for (int i =0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
    //Kiem tra so nguyen to
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            int squa = (int)Math.sqrt(n);
            for (int j = 3; j < squa; j++ ) {
                if (n % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    //tim so nguyen to cuoi cung
    public static int lastPrime(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (isPrime(arr[i]) == true) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang vao:");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.print("Mang khong hop le");
            System.exit(0);
        }
        int[] array = new int[n];
        inArray(array);
        outArray(array);
        int result = lastPrime(array);
        System.out.printf("So nguyen to cuoi cung la: %d", result);
    }
}

