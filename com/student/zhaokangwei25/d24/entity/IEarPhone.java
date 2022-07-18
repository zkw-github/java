package com.student.zhaokangwei25.d24.entity;

public interface IEarPhone {
    byte diameter=20;//直径，单位毫米
    byte length=40;//长度，单位毫米

    /**
     * 当耳机插入耳机接口后执行的方法
     */
    void earPhoneInsert();

    /**
     * 当耳机从耳机接口拔出后执行的方法
     */
    void earPhonePullOut();
    /**
     * 播放后执行的方法
     */
    void earPhonePlay();
}
