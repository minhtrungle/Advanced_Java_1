package Exercises2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex127 {
    /*127.Viết hàm sắp xếp mảng một chiều các số thực tăng dần.*/
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

        float temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
