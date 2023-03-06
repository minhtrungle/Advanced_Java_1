package Day3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //tao doi tuong
        Dog d1 = new Dog();
        d1.id = 1;
        d1.name = "tit";
        d1.color = "Black";
        d1.eat();
        d1.run();
        //tao doi tuong d2 - du lieu nhap tu ban phim, dung cac phuong thuc de chay
        Dog d2 = new Dog();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap id: ");
        d2.id = Integer.parseInt(in.nextLine()); //ep kieu
        System.out.print("Nhap name: ");
        d2.name = in.nextLine();
        System.out.print("Nhap color: ");
        d2.color = in.nextLine();

        d2.eat();
        d2.run();
        d2.sleep();

    }
}
