package demoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFirst {
    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        //**************************

        //format date
        date01();

        //parse string to date
        dateParse();

    }

    private static void dateParse() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-05-13 15:17:31");
        System.out.println(date);
    }

    private static void date01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }


}
