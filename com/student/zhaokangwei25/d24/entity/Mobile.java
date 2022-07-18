package com.student.zhaokangwei25.d24.entity;

public class Mobile implements IEarPhone{
    /**
     * 插入耳机接口时执行的方法
     */
    @Override
    public void earPhoneInsert() {
        System.out.println("插上耳机了，关闭外部喇叭，设备直径："+diameter+",长度："+length);
    }

    /**
     * 拔出耳机接口执行的方法
     */
    @Override
    public void earPhonePullOut() {
        System.out.println("拔出耳机，外部喇叭继续播放音乐");
    }

    /**
     * 通过耳机接口传播音频数据的方法
     */
    @Override
    public void earPhonePlay() {
        System.out.println("正在传输手机里的好音乐");
    }
}
