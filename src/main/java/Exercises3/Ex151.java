package Exercises3;

import java.util.Scanner;

/*151.Hãy tìm “số nguyên tố lớn nhất” trong mảng một chiều các số nguyên
(nguyentolonnhat). Nếu mảng không có số nguyên tố thì trả về giá trị 0.*/
public class Ex151 {
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
    //Tim so nguyen to lon nhat
    public static int maxPrime(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == true) {
                max = arr[i];
                count ++;
                break;// Cho so nguyen to dau tien la lon nhat
            }
        }
        if (count == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == true && max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
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
        int result = maxPrime(A);
        System.out.printf("So nguyen to lon nhat la: %d", result);
    }
}
