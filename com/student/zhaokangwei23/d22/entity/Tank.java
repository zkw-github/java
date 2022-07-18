package com.student.zhaokangwei23.d22.entity;

/**
 * 坦克类（子类）
 */
public class Tank extends Weapon{
    private String type;

    public Tank(String type) {
        super("坦克");
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void attack() {
        System.out.println(type+"开炮，bong....");
    }

    @Override
    public void move() {
        System.out.println(type+"开动，开向敌方阵营。");
    }
}
