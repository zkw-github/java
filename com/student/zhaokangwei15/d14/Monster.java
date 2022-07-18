package com.student.zhaokangwei15.d14;

public class Monster {
    private String name;//怪物名字
    private byte lifeValue;//生命值
    private short attackPower;//攻击力
    public Monster(){

    }
    public Monster(String name,byte lifeValue,short attackPower){
        setName(name);
        setLifeValue(lifeValue);
        setAttackPower(attackPower);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(byte lifeValue) {
        if(lifeValue<10&&lifeValue>=0){
            this.lifeValue=(byte) (lifeValue+ 20);
        }
        this.lifeValue=lifeValue;
    }

    public short getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(short attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(){
        System.out.println("怪物"+getName()+"展开攻击");
    }
    public void move(){

    }
}
