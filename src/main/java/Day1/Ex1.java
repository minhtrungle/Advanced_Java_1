package Day1;

import java.util.Scanner;
public class Ex1 {
    public  static void main (String[] args) {

        float x, y,z;
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        x = in.nextFloat();

        System.out.print("y=");
        y = in.nextFloat();

        System.out.print("z=");
        z = in.nextFloat();

        in.close();

        double tbc = (x + y +z) / 3.0;

        double tbn = Math.pow(x*y*z, 1/3);

        System.out.printf("Trung binh cong la: %.3f\n", tbc);
        System.out.printf("Trung binh nhan la: %.31" , tbn);
    }
}
