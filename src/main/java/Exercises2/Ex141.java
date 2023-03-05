package Exercises2;

import java.util.Scanner;

/*141.Hãy tìm “vị trí giá trị dương nhỏ nhất” trong mảng một chiều các số
thực (vtduongnhonhat). Nếu mảng không có giá trị dương thì trả về
một giá trị ngoài đoạn [0,n-1] là -1 nhằm mô tả không có vị trí nào thỏa
điều kiện.
*/
public class Ex141 {
    //Nhap mang
    public static void inArray(float[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = in.nextFloat();
        }
    }
    //Xuat mang
    public static void outArray(float[] arr) {
        System.out.print("Mang so thuc vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //Tim vi tri co gia tri duong nho nhat
    public static float minPlusNumberLocation(float[] arr) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                index = i;
                count ++;
                break; // Cho vi tri dau tien la gia tri duong dau tien
            }
        }
        if (count == 0) { //Khong co gia tri duong
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        while (n < 1) {
            System.out.print("Mang nhap khong hop le");
        }

        float[] arr = new float[n];
        inArray(arr);
        outArray(arr);
        float result = minPlusNumberLocation(arr);
        System.out.printf("\nVi tri co gia tri duong nho nhat la: %f", result);
    }
}
