package com.student.zhaokangwei23.d22.entity;

/**
 * 航母战舰类（子类）
 */
public class WarShip extends Weapon{
    private String type;

    public WarShip(String type) {
        super("战舰");
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
        System.out.println(type+"发射导弹，bong....");
    }

    @Override
    public void move() {
        System.out.println(type+"冲向敌方阵营。");
    }
}
