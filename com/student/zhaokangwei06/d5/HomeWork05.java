package com.student.zhaokangwei06.d5;

public class HomeWork05 {
    public static void main(String[] args) {
        byte num = 0;
        for(short year=1950;year<=2050;year++){
            if(isALeapYear(year)){
                num++;
                System.out.print("  "+year);
                if(num%5==0)
                    System.out.println();
            }
        }
    }
    public static boolean isALeapYear(short year){
        return year%4==0&&year%100!=0||year%400==0;
    }
}

