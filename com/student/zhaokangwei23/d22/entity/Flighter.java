package com.student.zhaokangwei23.d22.entity;

/**
 * 战机类（子类）
 */
public class Flighter extends Weapon{
    private String type;

    public Flighter(String type) {
        super("战机");
        this.type= type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void attack() {
        System.out.println(type+"丢炸弹，bong....");
    }

    @Override
    public void move() {
        System.out.println(type+"飞向敌方阵营。");
    }
}
