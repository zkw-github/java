package com.student.zhaokangwei29.d28.work;
/**
 * 定义一个double类型小数变量，小数位尽量长点，如：3.1456。
 * 再定义丙
 * 个变量，int length(截取长度)、boolean  zeroize（是否补0），通过代码实现对小数位的截取。
 */

/**
 * 注意：如果变量是整数且需要补0，则也需要补0，比如：1.00
 *  思路：可以将double小数先转成字符串，再使用今天所学的字符串的方法来实现。
 */
public class Test3 {
    public static void main(String[] args) {
        double d=3.1415926;
        String str=" 3.1415926 ";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str.trim());
        //String str2=str+d;
        String str1=String.valueOf(d);
        System.out.println(str1);
        System.out.println(str1.substring(2));
//        String str3=str2.substring(2);
//        String str4=str2.substring(3,6);
//        int length=str3.length();
//        System.out.println(str4);
//        System.out.println("长度："+str4.length());
//        System.out.println(str3);
//        System.out.println("长度："+length);
        boolean  zeroize;//是否补0
    }
}
