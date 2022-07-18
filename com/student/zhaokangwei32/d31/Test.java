package com.student.zhaokangwei32.d31;

import java.util.Calendar;
import java.util.Date;

/**
 *  假设，每周曰到周六为整的一周，每周从周日开始算起。其中每周的周一、周二、周五需要去学校上课，总共再上9天本学期就结束了。
 *  计算上完 9 次课后的日期及星期，以及从当天起到本学期结束总共需要度过的天数。
 *
 *
 *             (1)一周所要上课的天数，可以定义为周一、周二、周五共3天上课
 *
 *             (2)需要上的课次
 *
 *             (3) 上完全部课程需要多少周，取整数
 *
 *             (4) 取整后多余的天数
 *
 *             (5) 上了多少次课
 *
 *             (6) 取整后所剩的课程数
 *
 *             (7) 上课所花的时间总数
 *
 *             (8) 今天是周几
 */

public class Test {
    public static void main(String[] args) {
        final byte HAVEClass_OF_WEEK=3;//一周所要上课的天数，可以定义为周一、周二、周五共3天上课
        final byte COURSENUM=9;//需要上的课次
        byte  weeks=0;//上完全部课程需要多少周，取整数
        byte surplusDay=-1;//取整后多余的天数
        byte count=0;//上了多少次课
        byte surplusClass=-1;//取整后所剩的课程数
        byte total=0;//上课所花的时间总数
        int weekdays=-1;//今天周几
        Date date=new Date(1658135986073L);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        weekdays=(calendar.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println(weekdays);
        switch (weekdays){
            case 0://周日不上课
            case 1:
                count++;//上课
            case 2:
                count++;//上课
            case 3:
            case 4:
            case 5:
                count++;//上课
            case 6:
                break;
        }
        if(weekdays!=0)
            surplusDay= (byte) (6-weekdays);
        //获取上除去本周上的课程数，剩余课程数需要上多少周,取整
       byte weekcount= (byte) ((COURSENUM-count)/(HAVEClass_OF_WEEK));
       //取整周剩余多少课程数
      surplusClass  = (byte) ((COURSENUM-count)-(weekcount*HAVEClass_OF_WEEK));
      switch (surplusClass){
          case 0:

              surplusDay-=1;
              break;
          case 1:
              surplusDay+=2;
              break;
          case 2:
              surplusDay+=3;
              break;
      }
      //上课要用的总天数
        total= (byte) (weekcount*7+surplusDay);
      //设置课程结束当天的日期
        calendar.add(Calendar.DAY_OF_MONTH,total);
        String strweek="";
        byte week= (byte) (calendar.get(Calendar.DAY_OF_WEEK)-1);
        switch (week){
            case 0:
                strweek="星期日";
                break;
            case 1:
                strweek="星期一";
                break;
            case 2:
                strweek="星期二";
                break;
            case 3:
                strweek="星期三";
                break;
            case 4:
                strweek="星期四";
            case 5:
                strweek="星期五";
                break;
            case 6:
                strweek="星期六";
                break;
        }
        System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+ (calendar.get(Calendar.DATE))+"日 "+strweek);
        System.out.println("距离课程结束："+total+"天");



    }
}
