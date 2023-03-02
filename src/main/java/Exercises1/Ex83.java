package Exercises1;

import java.util.Scanner;

public class Ex83 {
    public static void main (String[] args) {
        /*Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng dấu hay không.*/
        float a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap 2 so thuc a, b");
        a = in.nextFloat();
        b = in.nextFloat();
        in.close();

        if (a * b > 0) {
            System.out.print("2 so cung dau");
        } else {
            System.out.print("2 số trái dấu");
        }
    }
}
