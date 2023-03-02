package Exercises1;

import java.util.Scanner;

public class Ex96 {
    public static void main (String[] args) {
        /*Viết chương trình nhập giá trị x sau khi tính giá trị của hàm số:*/
        float x, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x");
        x = in.nextFloat();
        in.close();

        result = 2 * (x * x) + 5*x + x + 9;

        if (x >= 5) {
            result = 2 * (x * x) + 5 * x + x + 9;
        } else {
            result = -2 * (x * x) + 4 * x - 9;
        }

        System.out.printf("Ket qua la: %.2f", result);
    }
}
