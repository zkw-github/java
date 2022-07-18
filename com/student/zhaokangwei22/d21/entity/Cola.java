package com.student.zhaokangwei22.d21.entity;

public class Cola extends Drink{
    private String species;//可乐种类

    public Cola(byte capacity, String species) {
        super("可乐", capacity);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("类型："+species);

    }
}
