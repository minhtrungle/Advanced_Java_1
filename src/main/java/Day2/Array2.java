package Day2;

import java.util.Random;
import java.util.Scanner;

public class Array2 {
    /*Tạo 1 mảng gồm n phần tử, nhập giá trị và in ra*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang:");
        int n = in.nextInt();
        in.close();

        if (n < 1) {
            System.out.print("Kich thuoc mang khong hop le");
            System.exit(0);
        }
        Random random = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i ++) {
            arr[i] = random.nextInt(1000);
        }
        for (int i = 0; i < n; i ++) {
            System.out.printf("arr[%d] = \n", i,arr[i]);
        }

     }
}
