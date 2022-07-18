package com.student.zhaokangwei18.d17;

public class ColorPrinter extends Printer{

    public ColorPrinter(String brand) {
        super(brand);
    }

    @Override
    public void print(String str) {
        System.out.println("开始打印，打印的彩色内容.."+str);
    }
}
