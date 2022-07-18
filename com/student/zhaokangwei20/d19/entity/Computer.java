package com.student.zhaokangwei20.d19.entity;

public class Computer implements IUsb,IHdmi{
    private String brand;//电脑品牌

    public Computer(String brand) {
        this.brand = brand;
        System.out.println("生产了一台"+brand+"牌的电脑");
        System.out.println("usb接口的宽度是："+usbWidth+"毫米,usb接口的高度是："+usbHeight
                +"毫米,usb接口里面的铜片数是："+usbCopperCount+"个");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void usbInset() {
        System.out.println("电脑提示：有外部设备插入，请选择直接接打开还是扫描");
    }

    @Override
    public void usbTransfer() {
        System.out.println("电脑提示：文件拷贝中，请勿断开");
    }

    @Override
    public void usbPullout(boolean safe) {
        if(safe){
            System.out.println("电脑提示：外部设备已安全移除");
        }else{
            System.out.println("电脑提示：外部设备未安全移除，对外部设备可能产生影响");
        }
    }

}
