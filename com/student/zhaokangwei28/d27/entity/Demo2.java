package com.student.zhaokangwei28.d27.entity;

/**
 * 通过valueOf的方式创建一个Integer类变量，并获取该变量int值（拆箱）
 */
public class Demo2 {
    public static void main(String[] args) {
       Integer integer= Integer.valueOf(123456);
       int integer2 =integer.intValue();
        System.out.println(integer2);//拆箱

    }
}
