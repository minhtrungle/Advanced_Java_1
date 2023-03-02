package Day1;
import java.util.Scanner;
public class Ex5 {
    public static void main (String[] args) {
        /*giai phuong trinh bac nhat ax+b=0*/
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap a va b ");
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        float x = -b / a;


        if (a == 0 && b == 0) {
            System.out.println("phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("phuong trinh vo nghiem");
        } else {
            System.out.println(x);
        }
    }
}

