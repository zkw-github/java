package com.student.zhaokangwei21.d20.entity;

public class SeafoodPizza extends Pizza{
    private String burden;

    public SeafoodPizza(float price, byte size, String burden) {
        super("海鲜比萨", price, size);
        this.burden = burden;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;//配料
    }

    @Override
    public void show() {
        super.show();
        System.out.println("配料："+burden);
    }
}
