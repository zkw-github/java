package com.student.zhaokangwei30.d29;

import java.math.BigDecimal;

/**
 * 大数字运算类
 */
public class TestBigdata {
    public static void main(String[] args) {
        BigDecimal bd1=new BigDecimal("2.5");
       BigDecimal bd2=new BigDecimal("2.5");
        System.out.println("和："+bd1.add(bd2));
        System.out.println("差："+bd2.subtract(bd1));
        System.out.println("乘："+bd1.multiply(bd2));
        System.out.println("除："+bd2.divide(bd1));
        System.out.println("两个数的比较："+bd1.compareTo(bd2));

    }
}
