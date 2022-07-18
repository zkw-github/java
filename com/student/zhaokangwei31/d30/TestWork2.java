package com.student.zhaokangwei31.d30;

import java.util.Date;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.l;

/**
 *    第1步：可以先获取两个时间的毫秒数差值
 *    第2步：毫秒/1000得到对应秒数，再除以60得到对应分钟数，再除以60得到对应小时数，再除以24得到对应天数。注意：得
 *    到的天数可能是小数，就用咱们之前学过的方法取整。
 *    第3步：算出相差的天数了，再通过总毫秒数减去天数净占的毫秒数（上一步因为取整会切掉小数部分），得到除开天数之后剩
 *    余的小时对应的毫秒数，再用剩余的毫秒数/1000，再除以60，再除以60，就得到了小时数。注意这里得到的小时数可能也是    小数，也同样需要咱们之前学过的方法取整。
 *    第4步：以此类推，继续计算出剩余的分钟数和秒数。
 */
public class TestWork2 {
    public static void main(String[] args) {
        Date date=new Date(1657863010000L);//过去时间段
        Date date1=new Date();//获取电脑当前时间
        long passMilli=date.getTime();//过去时间段的毫秒数
        long currentMilli=date1.getTime();//当前时间段的毫秒数
        long difference=currentMilli-passMilli;//两个时间段的毫秒数差值
        long days=(difference/1000/60/60/24);//天数
        long hous=(difference-days*24*60*60*1000)/1000/60/60;//小时数
        long minutes=(difference-days*24*60*60*1000-hous*60*60*1000)/1000/60;//分钟数
        long seconds=(difference-days*24*60*60*1000-hous*60*60*1000-minutes*60*1000)/1000;//秒
        System.out.println("过去时间段："+date);
        System.out.println("电脑当前时间："+date1);
        System.out.println("两个时间差："+days+"天"+hous+"时"+minutes+"分"+seconds+"秒");


    }
}
