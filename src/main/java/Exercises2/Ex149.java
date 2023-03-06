package Exercises2;

import java.io.IOException;
import java.util.Scanner;

/*149.Tìm “số hoàn thiện cuối cùng” trong mảng một chiều các số nguyên
(hoanthiencuoi). Nếu mảng không có số hoàn thiện thì hàm sẽ trả về
giá trị -1.*/
public class Ex149 {
    //Nhap mang
    public static void inArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextInt();
        }
    }
    //Xuat mang
    public static void outArray(int[] arr) {
        System.out.print("Mang so nguyen vua nhap la:");
        for (int i =0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
    //Kiem tra so hoan thien
    public static boolean isCompleteNumber(int n) {
        long sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        } if (sum == n) {
            return true;
        }
        return false;
    }
    //Tim so hoan thien cuoi cung
    public static int lastCompleteNumber(int[] arr) {
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (isCompleteNumber(arr[i]) == true) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang vao:");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.print("Mang khong hop le");
            System.exit(0);
        }
        int[] array = new int[n];
        inArray(array);
        outArray(array);
        int result = lastCompleteNumber(array);
        System.out.printf("So hoan thien cuoi cung la: %d", result);
    }
}
