package Exercises2;

import java.util.Scanner;

/*145.Tìm “số hoàn thiện đầu tiên” trong mảng một chiều các số nguyên
(hoanthiendau). Nếu mảng không có số hoàn thiện thì trả về giá trị -1.*/
public class Ex145 {
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
    //Kiem tra so hoan thien (vd so 28)
    public static boolean completeNumber(int n) {
        int sum = 0;
        for (int j = 1; j <= n/2; j++ ) {
            if (n % j == 0) {
                sum += j;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
    //Tim so hoan thien dau tien
    public static int firstCompleteNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (completeNumber(arr[i]) == true) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        while (n <= 0) {
            System.out.printf("Mang khong hop le");
            System.exit(0);
        }

        int[] A = new int[n];
        inArray(A);
        outArray(A);
        int result = firstCompleteNumber(A);
        System.out.printf("So hoan hao dau tien la: %d", result);
    }
}
