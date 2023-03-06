package Exercises3;

import java.util.Scanner;

/*153.Hãy tìm “giá trị chẵn nhỏ nhất” trong mảng một chiều các số nguyên
(channhonhat). Nếu mảng không có giá trị chẵn thì trả về giá trị không
chẵn là -1.*/
public class Ex153 {
    //Nhap mang
    public static void inArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] ", i);
            arr[i] = in.nextInt();
        }
    }
    //Xuat mang
    public static void outArray(int[] arr) {
        System.out.print("Mang so nguyen ban vua nhap");
        for (int array : arr) {
            System.out.print(array + "\t");
        }
    }
    //Tim so chan nho nhat
    public static int minEvenNumber(int[] arr) {
        int min = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                min = arr[i];
                count ++;
                break;
            }
        } if (count == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        while (n <= 0) {
            System.out.printf("Nhap lai kich thuoc mang");
            System.exit(0);
        }

        int[] A = new int[n];
        inArray(A);
        outArray(A);
        int result = minEvenNumber(A);
        System.out.printf("So chan nho nhat la: %d", result);
    }
}
