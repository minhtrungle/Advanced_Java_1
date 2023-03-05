package Exercises2;

import java.util.Scanner;

/*139. Tìm “vị trí số hoàn thiện cuối cùng” trong mảng một chiều các số
nguyên (vitrihoanthiencuoi). Nếu mảng không có số hoàn thiện thì trả
về giá trị - 1.*/
public class Ex139 {
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
    //Tim vi tri cua so hoan thien cuoi cung
    public static int lastCompleteNumberLocation(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (completeNumber(arr[i]) == true) {
                return  i;
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
        int result = lastCompleteNumberLocation(A);
        System.out.printf("Vi tri co so hoan hao la: %d", result);
    }
}

