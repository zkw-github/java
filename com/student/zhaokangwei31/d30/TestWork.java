package com.student.zhaokangwei31.d30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *  获取当前时间一分钟之后的时间，要求按格式：xx月xx日 xx时xx分xx秒  来输出；
 */
public class TestWork {
    public static void main(String[] args) {
        Date date=new Date();//获取当前日期和时间
        LocalDate localDate=LocalDate.now();
        LocalDate localDate1=LocalDate.of(2022,7,16);
        LocalDate localDate2=LocalDate.parse("2022-07-16");
        System.out.println(localDate1);
        System.out.println(localDate2);
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println("当前日期："+localDate.format(dateTimeFormatter));
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);//设置当前日期
        System.out.println("获取当前日期："+calendar.getTime());
        calendar.add(Calendar.MINUTE,1);
        System.out.println("一分钟后时间："+calendar.getTime());
        LocalDateTime localDateTime=LocalDateTime.now();//获取当前日和时间
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println("当前时间："+localDateTime.format(dateTimeFormatter1));
        System.out.println("当前时间："+localDateTime.getYear()+"年"+
                localDateTime.getMonthValue()+"月"+localDateTime.getDayOfMonth()+"日 "
        +localDateTime.getHour()+"时"+localDateTime.getMinute()+"分"+localDateTime.getSecond()+"秒");
        System.out.println("一分钟后时间："+localDateTime.getYear()+"年"+
                localDateTime.getMonthValue()+"月"+localDateTime.getDayOfMonth()+"日 "
                +localDateTime.getHour()+"时"+((localDateTime.getMinute())+1)+"分"+localDateTime.getSecond()+"秒");



    }
}
