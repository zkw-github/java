package com.student.zhaokangwei18.d17;

/**
 * 打印机类（父类）
 */
public class Printer {
    private String brand;

    public Printer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void print(String str){
        System.out.println(str);
    }
}
