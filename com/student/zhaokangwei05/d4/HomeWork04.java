package com.student.zhaokangwei05.d4;

public class HomeWork04 {
    public static void main(String[] args) {
        short year=2020;
       boolean y= isLeapYear(year);
        System.out.println(y);


    }
    public static boolean isLeapYear(short year){
        if((year%4==0&&year%100!=0)||year%400==0)
            return true;
        else
            return false;

    }
}

