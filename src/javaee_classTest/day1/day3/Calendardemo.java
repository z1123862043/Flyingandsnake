package javaee_classTest.day1.day3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendardemo {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(si.format(calendar.getTime()));
        System.out.println("推算56天前，7小时后");
        calendar.add(Calendar.DAY_OF_MONTH,-56);
        calendar.add(Calendar.HOUR_OF_DAY,7);
        System.out.println(si.format(calendar.getTime()));
    }
}
