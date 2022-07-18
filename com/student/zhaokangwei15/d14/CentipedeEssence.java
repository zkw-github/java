package com.student.zhaokangwei15.d14;

public class CentipedeEssence extends Monster{
    public   CentipedeEssence(String name, byte lifeValue, short attackPower){
       super(name,lifeValue,attackPower);
   }
   @Override
    public void attack(){
        System.out.println("怪物"+getName()+"展开攻击");
        System.out.println("当前生命值："+getLifeValue());
       System.out.println("攻击力是："+getAttackPower());
    }
    @Override
    public void move(){
        System.out.println("我是"+getName()+",我御风飞行");
    }

}
