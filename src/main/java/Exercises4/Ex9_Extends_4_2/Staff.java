package Exercises4.Ex9_Extends_4_2;

public class Staff extends Person {
    private String school;
    private double pay;
    public Staff() {

    }
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
