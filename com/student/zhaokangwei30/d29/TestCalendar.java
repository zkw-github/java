package com.student.zhaokangwei30.d29;

import java.util.Calendar;
import java.util.Date;

/**
 * 学习日历类
 */
public class TestCalendar {
    public static void main(String[] args) {
        Date date=new Date();
       // System.out.println(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);//设置当前日期
        Calendar calendar1=Calendar.getInstance();
        Date date1=new Date(1657897411958L);
        calendar1.setTime(date1);
        System.out.println(calendar1.compareTo(calendar));
        System.out.println(calendar.after(calendar1));
        System.out.println(calendar.before(calendar1));
//        System.out.println(calendar.getTime());
//        calendar.add(Calendar.HOUR,2);
//        System.out.println(calendar.getTime());
    }
}
