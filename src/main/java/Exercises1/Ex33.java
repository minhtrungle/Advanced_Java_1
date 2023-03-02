package Exercises1;

import java.util.Scanner;
import  static java.lang.Math.sqrt;

public class Ex33 {
    public  static  void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = in.nextInt();
        in.close();

        if (n < 1) {
            System.out.println("Nhap lai n");
            System.exit(0);
        }

        double x = sqrt(2);
        for (int i = 2; i <= n; i++) {
            x = sqrt(2 + x);
        }
        System.out.printf("Ket qua la: %f", x);
    }
}
