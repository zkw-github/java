package com.student.zhaokangwei29.d28;

/**
 * 一、	定义一个字符串变量，内容自己定，最好有字母、数字等，长度最好大于20；
 *
 * （1） 控制台输出该字符串；
 *
 * （2） 控制台输出该字符串的长度；
 *
 * （3）	从下标2开始截取该字符串，长度为3，并输出结果；
 *
 * （4）	从下标3开始、下标6结束截取该字符串，并输出结果；
 *
 * （5）	判断某个字符 是否出现在该字符串，并输出结果；（这里大家输出一个包含的，再输出一个不包含的）
 *
 * （6）	将字符串全部转换为大写输出；
 *
 * （7）	将字符串全部转换为小写输出；
 *
 * （8）	输出下标为2的字符；
 *
 * （9）	将字符串的某个字符全部批量替换为另一个字符，将输出结果；
 *
 * （10）计算某字符出现的次数，并输出结果；
 *
 *     思路：可以结合字符串的indexOf()、while循环等来实现
 */
public class Test {
    public static void main(String[] args) {
//        String str="12abcbab";
//        for(int i=1;i<=25;i++){
//            str+=i;
//        }
//        System.out.println("字符串："+str);//输出字符串
//        System.out.println("长度："+str.length());//输出字符串的长度
//        System.out.println("截取："+str.substring(2,5));//字符串的截取或提取
//        System.out.println(str.replaceFirst("//d","*"));
//        System.out.println(str.indexOf('d'));
//        System.out.println(str.indexOf("b"));
//        System.out.println("全部大写："+str.toUpperCase());
//        System.out.println("全部小写："+str.toLowerCase());
//        System.out.println(str.charAt(2));
//        System.out.println("替换："+str.replace('b','B'));
//        System.out.println("出现次数："+str.indexOf(5,1));//出现次数
//        StringBuffer buffer=new StringBuffer();
//        buffer.append("1233445");
//        System.out.println(buffer);
//        buffer.setCharAt(1,'6');
//        System.out.println(buffer);
//        buffer.deleteCharAt(0);
//        System.out.println(buffer);
//        buffer.reverse();
//        System.out.println(buffer);
//        String str="abc";
//        String str2="def";
//        String str3=str.concat(str2);
//        System.out.println(str3);
        StringBuilder stringBuffer=new StringBuilder();
        stringBuffer.append("987654");
        System.out.println(stringBuffer);

    }

}
