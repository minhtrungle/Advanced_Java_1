package Day2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = in.nextInt();
        in.close();

        Random random = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i ++) {
            arr[i] = random.nextInt(10000);
        }
        //foreach
        for ( int value : arr) {
            System.out.println(value + "\t");
        }

        int max = arr[0];
        int min = arr[0];
        int Medium;
        int Sum = 0;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            Sum += arr[i];
        }

        Medium = Sum / n;
        System.out.println("So lơn nhat la:" + max);
        System.out.println("So be nhat la:" +  min);
        System.out.println("Trung binh la:" + Medium);
    }
}
