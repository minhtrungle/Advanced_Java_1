package Exercises3;

import java.util.Scanner;

public class Ex117 {
    //Tính mũ
    public static double squareNumber(double a, int b) {
        if (b == 0) {
            return 1;
        }
        int  x = Math.abs(b);
        double t = 1;
        for (int i = 1; i < x; i ++) {
            t = t * a;
        } if (b > 0) {
            return t;
        }
        return 1/t;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = in.nextInt();

        if (n < 1) {
            System.out.print("Nhap lai n");
            System.exit(0);
        }
        int x = 2;
        double Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += squareNumber(x, i);;
        }
        System.out.println("Tong la: " + Sum);
    }
}
