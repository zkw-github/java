package com.student.zhaokangwei17.d16;

public class Bike  extends NonMotorVehicle{
    public Bike(String brand, String color) {
        super(brand, color);
    }
    public void run(){
        super.run();
        System.out.println("自行车类信息测试：这是一辆"+getColor()+"的"+getBrand()+"牌的自行车");
    }
}

