package com.student.zhaokangwei30.d29;


import java.util.Date;

/**
 * 学习Date类
 */
public class TestDate {
    public static void main(String[] args) {
        Date date=new Date();//获取当前日期和时间
        //System.out.println(date);
        System.out.println(date.getTime());//获取当前时间距离1970年1月1日的0时0分的时间戳，单位毫秒
        Date date1=new Date(1657897411958L);
        System.out.println((date1.getYear()+1900)+"年"+(date.getMonth()+1)+"月"+date1.getDate()+"日");
        Date date2=new Date(2022-1900,7-1,15);
        Date date3=new Date("2022/7/15 23:11:10");
        //System.out.println(date3);
    }
}
