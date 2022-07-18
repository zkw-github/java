package com.student.zhaokangwei18.d17;

public class BAWPrinter extends Printer{

    public BAWPrinter(String brand) {
        super(brand);
    }

    @Override
    public void print(String str) {
        System.out.println("开始打印,打印的黑白内容.."+str);
    }
}
