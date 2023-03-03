package Day2;

import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        /*Viết ct mô phỏng nhập dữ liệu người dùng gồm: username, password
        Mặc định có 1tk: user: admin, pass: admin
        nếu nhập đúng đưa ra thông báo thành công
        nếu nhập sai dưới 3 lần cho nập lại
        quá 3 lần thông báo đăng nhập thất bại
        kết thúc chương trình
        */

        Scanner in = new Scanner(System.in);
        String username, password;
        int nhap = 1;

        if (nhap >= 3) {
            System.out.print("Dang nhap that bai");
            System.exit(0);
        }
        while (nhap < 3) {
            System.out.print("Nhap username:");
            username = in.nextLine();
            System.out.print("Nhap password:");
            password = in.nextLine();
            if (username.equals("admin") && password.equals("admin")) {
                System.out.print("Dang nhap thanh cong");
                break;
            }
            System.out.print("Moi dang nhap lai");
            nhap ++;
        }
    }
}
