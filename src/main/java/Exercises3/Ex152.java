package Exercises3;

import java.util.Scanner;

/*152.Hãy tìm “hoàn thiện nhỏ nhất” trong mảng một chiều các số nguyên
(hoanthiennhonhat). Nếu mảng không có số hoàn thiện thì trả về giá trị
0.*/
public class Ex152 {
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
    //Tim so hoan thien nho nhat
    public static int minCompleteNumber(int[] arr) {
        int min = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (completeNumber(arr[i]) == true) {
                min = arr[i];
                count ++;
                break; //Cho so hoan thien nho nhat la so dau tien
            }
        } if (count == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (completeNumber(arr[i]) == true && min > arr[i]) {
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
            System.out.printf("Mang khong hop le");
            System.exit(0);
        }

        int[] A = new int[n];
        inArray(A);
        outArray(A);
        int result = minCompleteNumber(A);
        System.out.printf("So hoan thien nho nhat la: %d", result);
    }
}
