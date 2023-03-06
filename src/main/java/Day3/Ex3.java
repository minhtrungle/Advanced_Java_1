package Day3;

import java.util.Arrays;
import java.util.Scanner;

/*Tạo 1 mảng HinhTron
* in ra hình có chu vi lon nhat
* in ra hình có diện tích bé nhất
* tính trung bình của chu vi các hình tròn
* Có bao nhiêu hình có chu vi lớn hơn trung bình của các hình tròn
* Sắp xếp theo bán kính tăng dần và in ra*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        int n = in.nextInt();

        HinhTron[] arr = new HinhTron[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Hinh tron thu " + i + "\n");
            System.out.print("Nhap ban kinh");
            double r = in.nextDouble();
            arr[i] = new HinhTron(r); //Khai báo đối tượng mảng ở bên HinhTron
        }
        for (HinhTron ht : arr) {
            System.out.println(ht.toString());
        }
        //in ra hình có chu vi lon nhat
        double max = arr[0].tinhChuVi();
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i].tinhChuVi()) {
                max = arr[i].tinhChuVi();
                index = i;
            }
        }
        System.out.println(arr[index].toString());
        System.out.printf("Hinh co chu vi lon nhat la: %d", index);

        //in ra hình có diện tích bé nhất
        double min = arr[0].tinhDienTich();
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].tinhDienTich()) {
                min = arr[i].tinhDienTich();
                index2 = i;
            }
        }
        System.out.printf("\nHinh co dien tich be nhat la: %d", index2);

        //Tính trung bình của chu vi các hình tròn
        double Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i].tinhChuVi();
        }
        int result = (int) (Sum / n);
        System.out.printf("\nTong chu vi cac hinh tron: %f", Sum);
        System.out.printf("\nTrung binh chu vi cac hinh tron: %d", result);

        //Có bao nhiêu hình có chu vi lớn hơn trung bình chu vi của các hình tròn
        int Count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].tinhChuVi() > result) {
                Count ++;
            }
        }
        System.out.printf("\nCo so hinh tron co chu vi lon hon trung binh chu vi la: %d", Count);

        //Sắp xếp theo bán kính tăng dần và in ra
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].banKinh > arr[j].banKinh){
                    HinhTron temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (HinhTron ht :arr)
            System.out.println(ht.toString());

    }
}
