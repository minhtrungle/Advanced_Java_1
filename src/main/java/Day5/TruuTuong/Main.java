package Day5.TruuTuong;

public class Main {
    public static void main(String[] args) {
        //Dog
        Dog d = new Dog();
        d.makeSound();
        System.out.println(d);
        //Animal lỗi do lớp trừu tượng không trực tiếp tạo ra đối tượng mà thông qua lớp con kế thừa nó
        //Animal a = new Animal()

    }
}
