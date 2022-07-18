package com.student.zhaokangwei25.d24.entity;

public class Computer implements IEarPhone{
    @Override
    public void earPhoneInsert() {
        System.out.println("发现耳机设备，耳机直径是"+diameter+"耳机长度是："+length);
    }

    @Override
    public void earPhonePullOut() {
        System.out.println("耳机已从此电脑拔出");
    }

    @Override
    public void earPhonePlay() {
        System.out.println("正在播放励志歌曲。。。。");
    }
}
