package com.student.zhaokangwei21.d20.entity;

public abstract class Pizza {
    private String name;
    private float price;
    private byte size;

    public Pizza(String name, float price, byte size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }
    public void show(){
        System.out.println("名称："+name);
        System.out.println("价格："+price);
        System.out.println("大小："+size);
    };


}

