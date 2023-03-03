package Exercises2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex122 {
    /*122.Tìm giá trị lớn nhất trong mảng một chiều các số thực.*/
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = in.nextInt();
        in.close();

        Random random = new Random();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextFloat(10000);
        }
        //foreach
        for (double value : arr) {
            System.out.println(value + "\t");
        }

        double max = arr[0];

        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("So lơn nhat la:" + max);
    }
}
