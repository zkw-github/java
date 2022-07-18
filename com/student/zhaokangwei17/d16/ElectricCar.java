package com.student.zhaokangwei17.d16;

public class ElectricCar  extends NonMotorVehicle {
    private String batteryBrand;

    public ElectricCar(String brand,String color,String batteryBrand) {
        super(brand,color);
        setBatteryBrand(batteryBrand);
    }

    public String getBatteryBrand() {
        return batteryBrand;
    }

    public void setBatteryBrand(String batteryBrand) {
        this.batteryBrand = batteryBrand;
    }
    public void run(){
        super.run();
        System.out.println("电动车类信息测试：这是一辆使用"+getBatteryBrand()+"牌的电动车");
    }
}

