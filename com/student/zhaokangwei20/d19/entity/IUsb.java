package com.student.zhaokangwei20.d19.entity;

/**
 *
 */
public interface IUsb {
    byte usbWidth=100;//usb接口的宽度，单位是毫米
    byte usbHeight=20;//usb接口的高度，单位是毫米
    byte usbCopperCount=5;//usb接口里面的铜片数

    /**
     * 当插入usd接口后执行的方法
     */
      void usbInset();

    /**
     * 同过usb接口传输数据后执行的方法
     */
      void usbTransfer();

    /**
     * 拔出usb接口时执行的方法
     */
     void usbPullout(boolean safe);
}
