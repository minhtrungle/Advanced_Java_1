package Exercises2;

import java.util.Scanner;

/*138.Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số
nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả
về giá trị là – 1.*/
public class Ex138 {
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
    //Tim vi tri cua gia tri chan dau tien
    public static int firstEvenNumberLocation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return i;
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
        int result = firstEvenNumberLocation(A);
        System.out.printf("Vi tri co so chan dau tien la: %d", result);
    }
}
