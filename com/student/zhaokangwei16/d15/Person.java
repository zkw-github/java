package com.student.zhaokangwei16.d15;

/**
 * 请用面向对象的思想，设计自定义类描述演员和运动员的信息
 * 设定
 * 1)演员类:
 * 属性包括：姓名，年龄，性别，毕业院校，代表作
 * 方法包括：自我介绍
 * 2)运动员类：
 * 属性包括：姓名，年龄，性别，运动项目，历史最好成绩
 * 方法包括：自我介始
 * 要求
 * 3)分析演员和运动员的公共成员，提取出父类—人类
 * 4)利用继承机制，实现演员类和运动员类
 * 5)编写测试类，分别测试人类，演员类和运动员类对象及相关方法
 * 6)定义名为act的包存人类，演员类，运动员类和测试类
 * 结果输出：
 * 大家好，我是一个老百姓
 * ==============
 * 大家好，我是刘小翔
 * 今年23
 * 我擅长的项目是：200米短跑
 * 历史最好成绩是：22秒30
 * ==============
 * 大家好，我是章依
 * 今年27
 * 我毕业于：北京电影学院
 * 代表作有：《寄往天国的家书》
 */
public class Person {
    private String name;
    private short age;
    private char sex;

    public Person(String name, short age, char sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if(age<0){
            age=0;
            System.err.println("此年龄不符合实际，现已设为0");
        }
        if(age>150){
            age=150;
            System.err.println("此年龄超出正常范围，现已设为150");
        }
        this.age=age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex!='男'||sex!='女'){
            this.sex='男';
        }
    }
    public void introduce(){
        System.out.println("大家好，我是一个老百姓，我是"+getName());

    }

}