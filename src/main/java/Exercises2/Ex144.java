package Exercises2;

import java.util.Scanner;

/*144.Tìm “số nguyên tố đầu tiên” trong mảng một chiều các số nguyên
(nguyentodau). Nếu mảng không có số nguyên tố thì trả về giá trị -1.*/
public class Ex144 {
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
    //Kiem tra so nguyen to
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n > 2) {
            if (n % 2 == 0) {
                return false;
            }
            int squareRoot = (int) Math.sqrt(n);
            for (int j = 3; j < squareRoot; j++) {
                if (n % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    //Tim so nguyen to dau tien
    public static int firstPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == true) {
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
        int result = firstPrime(A);
        System.out.printf("So nguyen to dau tien la: %d", result);
    }
}
