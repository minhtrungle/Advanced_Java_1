package Exercises1;

import java.util.Scanner;

public class Ex97 {
    public static void main (String[] args) {
        /*Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết đó là tam giác gì?*/
        float a, b, c, x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap 3 canh cua tam giac la: a, b, c");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        in.close();

        if (a + b <= c && b + c <= a && a + c <=b) {
            System.out.println("Nhap lai 3 canh cua tam giac di ban");
        } else {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Tam giac nay vuong");
            } else if (a == b && a == c) {
                System.out.println("Tam giac nay deu");
            } else if (a == b || b == c || a == c) {
                if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                    System.out.println("Tam giac nay vuong can");
                } else {
                    System.out.println("Tam giac nay can");
                }
            }
        }
    }
}
