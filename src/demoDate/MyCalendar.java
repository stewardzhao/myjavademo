package demoDate;

import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) {
//        cal01();
//        cal02();
        runTime();
    }

    private static void runTime() {
        long l = System.currentTimeMillis();
        cal01();
        long e = System.currentTimeMillis();
        System.out.println("the program run time is : " + (e-l));
    }

    private static void cal02() {
        Calendar c = Calendar.getInstance();
        //set year
        c.set(Calendar.YEAR,1982);
        c.add(Calendar.YEAR,2);
        //set month
        c.set(Calendar.MONTH,11);
        //set day
        c.set(Calendar.DATE,19);
//        c.set(2099,10,23);
//        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);

        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("Day = " + day);
    }

    private static void cal01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("Day = " + day);
    }
}
