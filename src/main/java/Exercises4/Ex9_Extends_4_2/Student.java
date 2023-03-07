package Exercises4.Ex9_Extends_4_2;

public class Student extends Person {
    private String program;
    private int year;
    private  double fee;

    public Student() {
        super();
        year = 2023;
    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(String name, String address) {
        super(name, address);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            throw new RuntimeException("years phai duong");
        }
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }
}
