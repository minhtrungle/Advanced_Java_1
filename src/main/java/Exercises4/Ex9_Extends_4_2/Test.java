package Exercises4.Ex9_Extends_4_2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("trung");
        s.setAddress("HN");
        s.setProgram("programer");
        s.setFee(23);
        System.out.println(s);

        Staff st = new Staff();
        st.setName("trung");
        st.setAddress("HN");
        st.setSchool("HUST");
        st.setPay(256);
        System.out.println(st);

        Staff st2 = new Staff("trung2", "HN", "HUST", 4676);
        System.out.println(st2);
    }
}
