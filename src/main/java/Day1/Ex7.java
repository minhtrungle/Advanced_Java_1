package Day1;
import java.util.Scanner;

import static java.lang.Math.sqrt;
public class Ex7 {
    public static void main (String[] args) {
        /*nhap so nguyen x kiem tra có phai so chinh phuong*/
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap thang va nam ");
        x = in.nextInt();
        y = in.nextInt();
        in.close();
        if (x < 1 || x > 12) {
            System.out.println("Thang khong thoa man");
            System.exit(0);
        }
        switch (x) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Co 30 ngay");
                break;
            case 2:
        }       if (y%4 == 0 && y%100 !=0 || y%400 == 0 ) {
            System.out.println("Co 29 ngay");
        } else {
            System.out.println("Co 28 ngay");
        }


    }
}

