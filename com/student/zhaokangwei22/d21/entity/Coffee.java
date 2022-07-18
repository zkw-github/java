package com.student.zhaokangwei22.d21.entity;

public class Coffee extends Drink{
    private String burden;//咖啡配料

    public Coffee(byte capacity,String burden) {
        super("咖啡", capacity);
        this.burden = burden;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("添加配料："+burden);

    }
}
