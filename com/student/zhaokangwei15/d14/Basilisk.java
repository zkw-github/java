package com.student.zhaokangwei15.d14;

/**
 * 蛇怪类
 */
public class Basilisk extends Monster{

    public Basilisk(String name,byte lifeValue,short attackPower){
        super(name,lifeValue,attackPower);
    }
    @Override
    public void attack(){
        System.out.println("怪物"+getName()+"展开攻击");
    }
    public void addBlood(){
        if(getLifeValue()<10&&getLifeValue()>=0){
            setLifeValue((byte) (getLifeValue()+20));
        }
        System.out.println("实施大蛇补血术......，当前的生命值"+getLifeValue());
    }
    @Override
    public void move(){
        System.out.println("我是蛇，我走s路线");
    }



}
