package com.student.zhaokangwei28.d27.entity;

/**
 *  通过new 的方式创建一个Double类的变量（装箱），并获取该变量的double值（拆箱）
 */
public class Demo {
    public static void main(String[] args) {
        Double double1 =new Double(56.7);//将基本数据类型转换成包装类，即装箱
        double double2=double1.doubleValue();//将包装类转换成基本数据类型，即拆箱
        System.out.println(double2);

    }
}
