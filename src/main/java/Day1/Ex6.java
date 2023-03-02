package Day1;
import java.util.Scanner;

import static java.lang.Math.sqrt;
public class Ex6 {
    public static void main (String[] args) {
        /*nhap so nguyen x kiem tra có phai so chinh phuong*/
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x ");
        x = in.nextInt();
        in.close();
        double sqr = sqrt(x);
        // ep kieu
        int temp = (int)sqr;

        if (x == temp*temp) {
            System.out.println("x la so chinh phuong");
        } else if (x < 0) {
            System.out.println("x khong thoa man");
        } else {
            System.out.println("x khong la so chinh phuong");
        }
    }
}
