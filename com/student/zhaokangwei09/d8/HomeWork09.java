package com.student.zhaokangwei09.d8;

public class HomeWork09 {
    public static void main(String[] args) {
       for(short num=100;num<1000;num++){
           if(isTheNumberOfDaffodils(num))
               System.out.println(num);

       }
    }
    public static boolean isTheNumberOfDaffodils(short num){
        int x,y,z;
        x=num%10;
        y=(num-x)/10%10;
        z=num/100;
        return num==x*x*x+y*y*y+z*z*z;
    }
}
