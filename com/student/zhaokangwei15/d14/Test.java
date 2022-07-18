package com.student.zhaokangwei15.d14;

public class Test {
    public static void main(String[] args) {
        Basilisk basilisk=new Basilisk("怪蛇甲",(byte) 5,(short) 20);
        basilisk.attack();
        basilisk.addBlood();
        basilisk.move();
        System.out.println("======================================");
       CentipedeEssence centipedeEssence= new CentipedeEssence("蜈蚣精乙",(byte) 60,(short) 15);
       centipedeEssence.attack();
       centipedeEssence.move();


    }
}
