package Day1;
import java.util.Scanner;
public class Ex4 {
    public static void main (String[] args) {
        /*nhap so nam x, hoi x la nam nhuan hay khong nhuan*/
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap nam ");
        x = in.nextInt();
        in.close();

        if (x%4 == 0 && x%100 !=0 || x%400 == 0 ) {
            System.out.println(x + "la nam nhuan");
        } else if ( x < 0) {
            System.out.println(x + "nam khong thoa man");
        } else {
            System.out.println(x + "la nam khong nhuan");
        }
    }
}
