package com.student.zhaokangwei22.d21.entity;

public class Drink {
    private String name;//饮料名称
    private byte capacity;//容量

    public Drink(String name, byte capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public byte getCapacity() {
        return capacity;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }
    public  void show(){
        System.out.println("您购买饮料信息如下。");
        System.out.println("名称："+name);
        System.out.println("容量："+capacity);
    }
}

