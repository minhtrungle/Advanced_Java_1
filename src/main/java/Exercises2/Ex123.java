package Exercises2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex123 {
    /*123.Viết hàm tìm một vị trí mà giá trị tại vị trí đó là một giá trị nhỏ nhất
    trong mảng một chiều các số nguyên.*/
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = in.nextInt();
        in.close();

        Random random = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10000);
        }
        //foreach
        for (int value : arr) {
            System.out.println(value + "\t");
        }

        int min = arr[0];
        int vitri = 0;
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                vitri = i;
            }
        }
        System.out.printf("So be nhat la %d, tai vi tri %d:\n", min, vitri);
    }
}
