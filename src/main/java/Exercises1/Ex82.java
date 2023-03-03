package Exercises1;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex82 {
    public static void main (String[] args) throws IOException {
        /*Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.*/
        float a, b, c, maxV;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a, b, c");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        in.close();

        maxV = (a > b) ? a : b;
        if (maxV > c) {
            maxV = maxV;
        } else {
            maxV = c;
        }
        System.out.printf("Gia tri lon nhat la: %.2f", maxV);
    }
}

