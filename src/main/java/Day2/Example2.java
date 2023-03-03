package Day2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        /* Nhập chuỗi từ bàn phím, in ra chuỗi viết hoa, chương trình sẽ dừng khi người dùng nhập exit */
        String str = "";
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("\nNhập chuỗi vào:");
            str = in.nextLine();
            str = str.toUpperCase();

            if (str.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Chuỗi viết hoa:" + str);
        }
        in.close();
    }
}

