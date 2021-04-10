package javaee_classTest.day1.day3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

        date.setTime(date.getTime()+54*24*60*60*1000l+8*60*60*1000l+4*60*1000l);
        System.out.println("经过54天，8小时，4分钟");
        System.out.println(simpleDateFormat.format(date));
    }
}
