package com.student.zhaokangwei20.d19.entity;

public interface IHdmi {
    byte HdmiWidth=40;//HDMI高清接口的宽度，单位是毫米
    byte HdmiHeight=20;//HDMI高清接口的高度，单位是毫米
    byte HdmiAngle=45;//HDMI高清接口的梯形角度
    /**
     * 当插入HDMI接口后执行的方法
     */
    void usbInset();

    /**
     * 同过HDMI接口传输数据后执行的方法
     */
    void usbTransfer();

    /**
     * 拔出HDMI接口时执行的方法
     */
    void usbPullout(boolean safe);
}
