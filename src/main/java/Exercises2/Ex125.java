package Exercises2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex125 {
    /*125.Viết hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng.*/
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

        int count = 0;
        boolean isPrime = true;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 2) {
                System.out.print("Khong co so nguyen to thoa man");
                break;
            }
            int squareRoot = (int) Math.sqrt(arr[i]);
            for (int j = 2; j < squareRoot; j ++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && arr[i] < 10000) {
                count++;
            }
        }
        System.out.printf("So so nguyen to nho hon 100 la: %d", count);


    }
}
