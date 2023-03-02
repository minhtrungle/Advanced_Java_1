package Day1;
import java.util.Scanner;
public class Ex3 {

    public static void main (String[] args) {
        /*nhap so nguyen x tu ban phim in ra x la so am hay duong*/
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x =");
        x = in.nextInt();
        in.close();

        if (x > 0) {
            System.out.println(x + "la so duong");
        } else if ( x < 0) {
            System.out.println(x + "la so am");
        } else {
            System.out.println(x + "khong la so duong, khong am");
        }
    }
}
