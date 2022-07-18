package com.student.zhaokangwei21.d20.entity;

public class BaconPizza extends Pizza{
    private byte baconGram;//培根克数

    public BaconPizza(float price, byte size, byte baconGram) {
        super("培根比萨", price, size);
        this.baconGram = baconGram;
    }

    public byte getBaconGram() {
        return baconGram;
    }

    public void setBaconGram(byte baconGram) {
        this.baconGram = baconGram;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("培根克数："+baconGram);
    }
}
