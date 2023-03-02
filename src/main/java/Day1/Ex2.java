package Day1;
import java.util.Scanner;
public class Ex2 {
    public  static void main (String[] args) {
        long x, y, z, t;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x, y, z, t");
        x = in.nextLong();
        y = in.nextLong();
        z = in.nextLong();
        t = in.nextLong();
        in.close();

        boolean A = (2*x > 5) && (3*y < 10) || (5*z + 6 >t);
        System.out.println(A);
    }
}
