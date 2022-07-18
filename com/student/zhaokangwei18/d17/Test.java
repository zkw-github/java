package com.student.zhaokangwei18.d17;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer;
        System.out.print("1/黑白，2/彩色:");
        int type;
        type=scanner.nextInt();
        if(type==1){
            printer=new BAWPrinter("惠普");
        }else if(type==2){
            printer=new ColorPrinter("华为");
        }else{
            printer=null;
            System.err.println("输入错误！！！");
        }
        printer.print("hello world!");

    }
}
