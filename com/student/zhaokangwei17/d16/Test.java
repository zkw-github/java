package com.student.zhaokangwei17.d16;

public class Test {
    public static void main(String[] args) {
       Bike bike= new Bike("天宇","红颜色");
       bike.run();
        System.out.println("========================================");
        ElectricCar electricCar=new ElectricCar("雅迪","黑色","海威");
        electricCar.run();
        System.out.println("========================================");
       Tricycle tricycle= new Tricycle("奔驰","黑色");
       tricycle.run();
    }
}
