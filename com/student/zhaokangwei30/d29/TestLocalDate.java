package com.student.zhaokangwei30.d29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 学习LocalDate类
 */
public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();//获取当前时间
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(localDate.format(dateTimeFormatter));
        //System.out.println(localDate.getYear()+"年"+localDate.getMonthValue()+"月"+localDate.getDayOfMonth()+"日");
//        LocalDate localDate1=LocalDate.of(2022,7,16);
//        System.out.println(localDate1);
//        LocalDate localDate2=LocalDate.parse("2022-07-16");
//        System.out.println(localDate2);
    }
}

