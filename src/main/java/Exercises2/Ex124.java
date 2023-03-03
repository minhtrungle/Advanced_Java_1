package Exercises2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex124 {
    /*124.Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ
        hơn 2004 hay không?*/
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

        int ressult = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] < 2004) {
                ressult = arr[i];
            }
        }
        System.out.printf("Gia tri chan nho hon 2004 la: %d:", ressult);
    }
}
