package com.student.zhaokangwei28.d27.entity;

/**
 * 把其它包装类的parseXXX()方法和valueOf()方法都练习一遍；
 */
public class Demo3 {
    public static void main(String[] args) {
       byte byte1 =Byte.parseByte("123");//parseByte方法
         System.out.println(byte1);
        byte byte2 =Byte.valueOf((byte) 121);
        System.out.println(byte2);
        short short1=Short.parseShort("12456");
        System.out.println(short1);
        short short2=Short.valueOf((short)100);
        System.out.println(short2);
         float float1= Float.parseFloat("4456.3");
        System.out.println(float1);
       float float2= Float.valueOf(2346.2f);
        System.out.println(float2);



    }
}
