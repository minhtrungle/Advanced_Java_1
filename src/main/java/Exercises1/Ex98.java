package Exercises1;

import java.util.Scanner;

public class Ex98 {
    public static void main (String[] args) {
        /*Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.*/
        float a, b, c, d, e, f, x, y, D, Dx, Dy;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap cac he so lan luot: a, b, c, d, e, f");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        d = in.nextFloat();
        e = in.nextFloat();
        f = in.nextFloat();

        in.close();

        D = a * e - b * d;
        Dx = c * e - b * f;
        Dy = a * f - c * d;
        if (Dx == 0 && Dy == 0) {
            System.out.printf("He phuong trinh vo so nghiem");
        } else {
            if (D != 0) {
                x = Dx / D;
                y = Dy / D;
                System.out.printf("He phuong trinh vco 1 nghiem duy nhat la: (%f, %f)", x, y);
            } else if (Dx != 0 || Dy != 0) {
                System.out.printf("He phuong trinh vo nghiem");
            }
        }
    }
}
