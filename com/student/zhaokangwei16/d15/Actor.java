package com.student.zhaokangwei16.d15;

/**
 * 演员类（子类）
 */

public class Actor extends Person {
    private  String school;//毕业院校
    private String masterpiece;//代表作

    public Actor(String name, short age, char sex, String school, String masterpiece) {
        super(name, age, sex);
        setSchool(school);
        setMasterpiece(masterpiece);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMasterpiece() {
        return masterpiece;
    }

    public void setMasterpiece(String masterpiece) {
        this.masterpiece = masterpiece;
    }

    /**
     * 演员类重写父类Person的自我介绍方法
     */

    public void introduce(){
        System.out.println("大家好，我是"+getName());
        System.out.println("今年"+getAge());
        System.out.println("我毕业于："+getSchool());
        System.out.println("代表作有："+getMasterpiece());
    }

}
