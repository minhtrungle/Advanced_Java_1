package Exercises2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex34 {
    public  static  void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = in.nextInt();
        in.close();
        while (n  < 1) {
            if (n < 1) {
                System.out.println("Nhap lai n");
                System.exit(0);
            }
        }

        double x = 0;
        for (int i = 1; i <= n; i++) {
            x = sqrt(i + x);
        }
        System.out.printf("Ket qua la: %f", x);
    }
}
