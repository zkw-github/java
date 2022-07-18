package com.student.zhaokangwei29.d28;

/**
 *  将某个字符串中的所有字符颠倒过来，如原字符串“Hello,world.“，颠倒之后变成”.dlrow,olleH“;
 *      使用两种方法，第一种需要通过String类提供的方法以及前面所学的循环来实现。
 *      第二种方法可以使用今天所学的字符串高级类来实现；
 */
public class Test2 {
    public static void main(String[] args) {
       StringBuffer stringBuffer= new StringBuffer("abc123def");//String类的高级类
        System.out.println(stringBuffer);
        stringBuffer.append("4567");
        System.out.println("拼接："+stringBuffer);
        stringBuffer.setCharAt(0,'A');
        System.out.println("替换字符："+stringBuffer);
        System.out.println("删除字符："+stringBuffer.deleteCharAt(1));
        System.out.println("反转字符串："+stringBuffer.reverse());
//        System.out.println(stringBuffer.reverse());
//        String str="abc1234";
//        System.out.println(str.replaceAll("\\d","*"));

    }
}
