package Exercises4.Ex7;

import java.text.SimpleDateFormat;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        try {
            if (day >= 1 && day <= 31) {
                this.day = day;
            } else {
                System.out.print("day khong hop le");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        try {
            if (month >= 1 && month <= 12) {
                this.month = month;
            } else {
                System.out.print("month khong hop le");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        try {
            if (year >= 1900 && year <= 9999) {
                this.year = year;
            } else {
                System.out.print("year khong hop le");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("always printed");
        }
    }

    public void setDate(int day, int month, int year) {
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//        String s = ;
//        Date date = formatter.parse(s);
//        System.out.println("Date object value: " + date);
    }
    @Override
    public String toString() {
        return day +
                "/" + month +
                "/"+ year;
    }
}
