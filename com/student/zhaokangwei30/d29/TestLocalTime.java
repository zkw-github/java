package com.student.zhaokangwei30.d29;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * 学习LocalDateTime类
 */
public class TestLocalTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.now();//获取当前日期和时间
        System.out.println("总秒数："+localDateTime.toEpochSecond(ZoneOffset.of("+8")));
        System.out.println("总毫秒数："+(localDateTime.toInstant(ZoneOffset.of("+8"))).toEpochMilli());
        Date date=new Date();
        System.out.println("总毫秒数："+date.getTime());

//        System.out.println(localDateTime);
//        System.out.println(localDateTime.getYear()+"年"+localDateTime.getMonthValue()+
//                "月"+localDateTime.getDayOfMonth()+"日 "+localDateTime.getHour()+
//                "时"+localDateTime.getMinute()+"分"+localDateTime.getSecond()+"秒");
//        LocalDateTime localDateTime1=LocalDateTime.of(2022,7,16,0,20,43);
//        System.out.println(localDateTime1);
//        LocalDateTime localDateTime2=LocalDateTime.parse("2022-07-16T00:23:50");
//        System.out.println(localDateTime2);
    }
}
