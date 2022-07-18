package com.student.zhaokangwei07.d6;

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {
        int x,y;
        Scanner input= new Scanner(System.in);
        System.out.println("Please input two numbers: ");
        x=input.nextInt();
        y=input.nextInt();
        System.out.println("before swapping: ");
        System.out.printf("%d%2d",x,y);
        System.out.println();
        System.out.println("after swapping: ");
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.printf("%d%2d",x,y);


    }

}
