package Day2;

import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) throws IOException {
        long n;
        float sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n vao:");
        n = in.nextLong();
        in.close();

        if (n < 1) {
            System.out.println("Nhap lai n");
            System.exit(0);
        }
        for (int i = 1; i <= n; i ++) {
            sum += 1.0 / i;
        }
        System.out.printf("Tong cua S(n) la: %f", sum);
    }
}
