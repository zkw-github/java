package com.student.zhaokangwei17.d16;

public class NonMotorVehicle {
    private String brand;
    private String color;
    private byte wheels=2;
    private byte seats=1;
    public NonMotorVehicle(){}
    public NonMotorVehicle(String brand,String color){
        setBrand(brand);
        setColor(color);
    }
    public NonMotorVehicle(String brand, String color, byte wheels, byte seats) {
        setBrand(brand);
        setColor(color);
        setWheels(wheels);
        setSeats(seats);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getWheels() {
        return wheels;
    }

    public void setWheels(byte wheels) {
        this.wheels = wheels;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }
    public void run(){
        System.out.println("父类信息测试：这是一辆"+color+"的，"+brand+
                "的非机动车，"+"有"+wheels+"个轮子，"+seats+"座椅");
    }
}
