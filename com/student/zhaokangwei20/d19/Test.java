package com.student.zhaokangwei20.d19;


import com.student.zhaokangwei20.d19.entity.Computer;
import com.student.zhaokangwei20.d19.entity.IUsb;

public class Test {
    public static void main(String[] args) {
        System.out.println("开始U盘在电脑上的操作。。。。");
        IUsb computer=new Computer("联想");
        computer.usbInset();
//        computer.usbInset();//模拟在电脑上插入U盘
//        computer.usbTransfer();//模拟在电脑上传输数据
//        computer.usbPullout(false);//模拟从电脑上拔出U盘
//        System.out.println("-------------------------------------------");
//        TV tv=new TV("29*18");
//        tv.usbInset();//模拟在电视机上插入U盘
//        tv.usbTransfer();//模拟在电视机上传输文件
//        tv.usbPullout(false);//模拟在电视机移除外部设备
    }
}
