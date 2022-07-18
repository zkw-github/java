package com.student.zhaokangwei17.d16;

public class Tricycle extends NonMotorVehicle {
    public Tricycle(String brand, String color) {
        super(brand, color, (byte) 3, (byte) 1);
    }
    public void run(){
        super.run();
        System.out.println("三轮车是一款有"+getWheels()+"的非机动车");
    }
}
