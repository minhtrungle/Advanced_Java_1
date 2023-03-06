package Exercises3;

import java.util.Scanner;

/*Hàm nhập n và tính tổng*/
public class Ex116 {
    public static long sumNumber(int n) {
        if (n < 1) {
            return -1;
        }
        long Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += i;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = in.nextInt();
        in.close();

        long result = sumNumber(n);
        if (result != -1) {
            System.out.printf("Tong: %d", result );
        } else {
            System.out.print("Khong hop le");
        }
    }
}
