package com.student.zhaokangwei24.d23.entity;

public class Car implements IDisplay{
    byte oilQuantity;//汽车油量

    public Car(byte oilQuantity) {
        this.oilQuantity = oilQuantity;
    }

    public byte getOilQuantity() {
        return oilQuantity;
    }

    public void setOilQuantity(byte oilQuantity) {
        this.oilQuantity = oilQuantity;
    }

    @Override
    public void display() {
        System.out.println("汽车油量："+oilQuantity+"L");
    }
}
