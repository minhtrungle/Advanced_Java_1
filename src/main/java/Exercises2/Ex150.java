package Exercises2;

import java.util.Scanner;

/*150.Hãy tìm “giá trị âm lớn nhất” trong mảng các số thực (amlonnhat). Nếu
mảng không có giá trị âm thì trả về giá trị 0.*/
public class Ex150 {
    //Nhap mang
    public static void inArray(double[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextFloat();
        }
    }
    //Xuat mang
    public static void outArray(double[] arr) {
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //Tim gia tri am lon nhat
    public static double maxMinusArray(double[] arr) {
        double max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                max = arr[i];
                count ++;
                break; //Cho gia tri am lon nhat là gia tri am dau tien
            }
        }
        if (count == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && max < arr[i]) {
                max = arr[i];
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        while (n <= 0) {
            System.out.print("Moi nhap lai mang");
        }

        double[] arr = new double[n];
        inArray(arr);
        outArray(arr);
        double result = maxMinusArray(arr);
        System.out.printf("\nGia tri am lon nhat la: %f", result);
    }
}
