package com.student.zhaokangwei16.d15;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person("Jack",(short) 18,'女');
        person1.introduce();
        System.out.println("----------------------------------------------------------------------");
        Person person2=new Athlete("刘小翔",(short)23,'男',"200米短跑","22秒30");
        person2.introduce();
        System.out.println("------------------------------------------------------------------------");
        Person person3=new Actor("章依",(short) 27,'男',"北京电影学院","《寄往天国的家书》");
        person3.introduce();
    }
}
