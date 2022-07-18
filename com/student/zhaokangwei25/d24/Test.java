package com.student.zhaokangwei25.d24;

import com.student.zhaokangwei25.d24.entity.Computer;
import com.student.zhaokangwei25.d24.entity.IEarPhone;
import com.student.zhaokangwei25.d24.entity.Mobile;

public class Test {
    public static void main(String[] args) {
       IEarPhone iEarPhone = new Computer();
       iEarPhone.earPhoneInsert();//模拟耳机插入电脑
       iEarPhone.earPhonePullOut();//模拟耳机从电脑拔出
       iEarPhone.earPhonePlay();//模拟耳机传输数据
        System.out.println("------------------------------------");
       IEarPhone iEarPhone1= new Mobile();
       iEarPhone1.earPhoneInsert();//模拟耳机插入手机
        iEarPhone1.earPhonePullOut();//模拟耳机拔出手机
        iEarPhone1.earPhonePlay();//模拟耳机传输数据

    }
}

