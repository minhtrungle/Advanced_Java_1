package Day4.KeThua_Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        NhanVien kt1 = new KyThuat("KT01","Nguyen Van A", "01/02/2000","HN", "CNTT");
        System.out.println(kt1);
        System.out.println(kt1.moTaCongViec());

        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập mã: ");
        String maNhanVien = in.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();

        NhanVien kt2 = new KyThuat(maNhanVien,hoTen, namSinh, diaChi, chuyenNghanh);
        System.out.println(kt2);
        System.out.println(kt2.moTaCongViec());

    }
}
