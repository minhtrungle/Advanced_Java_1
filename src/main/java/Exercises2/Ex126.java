package Exercises2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex126 {
    /*126.Viết hàm tính tổng các giá trị âm trong mảng một chiều các số thực.*/
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = in.nextInt();
        in.close();

        Random random = new Random();
        float[] arr = new float[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextFloat(10000);
        }
        //foreach
        for (float value : arr) {
            System.out.println(value + "\t");
        }

        int Sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                Sum += arr[i];
            }
        }
        System.out.print(Sum);
    }
}
