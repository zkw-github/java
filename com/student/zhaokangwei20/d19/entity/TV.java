package com.student.zhaokangwei20.d19.entity;

/**
 * 电视机类（子类）
 */
public class TV implements IUsb {
    private String size;

    public TV(String size) {
        this.size = size;
        System.out.println("生产一台"+size+"寸的电视机");
        System.out.println("usb接口的宽度是："+usbWidth+"毫米,高度是："+
                usbHeight+"毫米，里面的铜片个数是："+usbCopperCount);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void usbInset() {
        System.out.println("电视机提示：有外部设备插入，可以看好看的电影，赶快来看小伙伴们！！");
    }

    @Override
    public void usbTransfer() {
        System.out.println("电视机提示：无传usb接口功能");
    }

    @Override
    public void usbPullout(boolean safe) {
        if(safe){
            System.out.println("电视机提示：外部设备已安全移除");
        }else{
            System.out.println("电视机提示：外部设备未安全移除");
        }
    }
}
