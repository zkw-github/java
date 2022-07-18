package com.student.zhaokangwei23.d22.entity;

/**
 * 军队类
 */
public class Army {
    private String  name;
    private Weapon weapon;

    public Army(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println(name+"开始全面进攻了 >>>>>>>>>>>");
        weapon.attack();
    }
    public void move(){
        System.out.println(name+"开始全面移动了 >>>>>>>>>>>");
        weapon.move();
    }
}
