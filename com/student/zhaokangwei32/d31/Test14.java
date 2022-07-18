package com.student.zhaokangwei32.d31;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *  假设，每周曰到周六为整的一周，每周从周日开始算起。其中每周的周一、周二、周五需要去学校上课，总共再上9天本学期就结束了。
 *  计算上完 9 次课后的日期及星期，以及从当天起到本学期结束总共需要度过的天数。
 *
 *    思路提示：
 *
 *    定义若干变量，如：
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
import java.util.Calendar;
public class Test14
{
    //定义一周所要上课的天数。定义为周一、周二、周五共3天上课
    public static final int HAVEClass_OF_WEEK=3;
    //定义需要上的课次
    public static final int COURSENUM=9;
    public static void main(String[] args)
    {
        int weekCount=-1; //定义上完全部课程需要多少周，取整数
        int surplusDay=-1; //取整后多余的天数
        int count=0; //获取上了多少次课
        int surplusClass=-1; //取整后所剩的课程数
        int total=0; //上课所花的时间总数
        Calendar calendar=Calendar.getInstance();
        //获取今天是周几
        int weekdays=(calendar.get(Calendar.DAY_OF_WEEK)-1);
        /*
         *定义一周中所要上课的天数，若上课一天则count+1
         *周一、周二、周五上课
         *今天是周三，这个星期只有周五上课
         */
        switch(weekdays)
        {
            case 0:
            case 1: //上课
                count++;
            case 2: //上课
                count++;
            case 3:
            case 4:
            case 5: //上课
                count ++;
            case 6:
                break;
        }
        /*
         *计算今天是周几，如果不是周末，则计算到周六还有几天
         *（因为周日是一周的开始）
         */
        if(0!=weekdays)
            surplusDay=6-weekdays;
        //获取上课所用多少周，取整
        weekCount=(COURSENUM-count)/HAVEClass_OF_WEEK;
        //获取取整后剩下的课程数
        surplusClass=(COURSENUM-count)-(weekCount*HAVEClass_OF_WEEK);
        /*
         *计算取整周后剩下的次数（从每周日开始算起）
         *若不剩课程，则日期-1（因为取整后的最后一天为周六，不上课）
         *则计算周五的日期
         *若还剩1节课，肯定是周一上课，所以天数+2天
         *若还剩2节课，则周一、周二上课，所以天数+3天
         *若还剩3节课，则周一、周二、周五上课，所以天数+6天
         */
        switch(surplusClass)
        {
            case 0:
                surplusDay=surplusDay-1;
                break;
            case 1:
                surplusDay+=2;
                break;
            case 2:
                surplusDay+=3;
                break;
            case 5:
                surplusDay+=6;
                break;
        }
        //要上课所用的总天数
        total=surplusDay+(weekCount*7);
        //设置课程结束当天的日期
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+total);
        String strWeek="";
        int week=(calendar.get(Calendar.DAY_OF_WEEK)-1);
        switch(week)
        {
            case 1:
                strWeek="一";
                break;
            case 2:
                strWeek="二";
                break;
            case 3:
                strWeek="三";
                break;
            case 4:
                strWeek="四";
                break;
            case 5:
                strWeek="五";
                break;
            case 6:
                strWeek="六";
                break;
            case 7:
                strWeek="日";
                break;
        }
        //如果取整后剩下的课程数为零，直接取周五的日期
        System.out.println("距离本学期结束还有 "+total+" 天，日期为："+calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DATE)+"，星期"+strWeek);
    }
}
