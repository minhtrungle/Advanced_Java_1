package Day1;
import java.util.Scanner;
public class Example2 {
    public  static  void  main(String[] args) {
        int a;
        int b;

        //Nhap du lieu
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextInt();

        System.out.print("b = ");
        b = in.nextInt();
        in.close();

        int c = a + b;
        System.out.printf("%d + %d = %d", a, b,c);


    }
}
