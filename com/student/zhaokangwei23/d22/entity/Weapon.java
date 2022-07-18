package com.student.zhaokangwei23.d22.entity;

public abstract class Weapon {
    String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   abstract void attack();
   abstract void move();
}
