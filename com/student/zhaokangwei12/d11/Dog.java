package com.student.zhaokangwei12.d11;

public class Dog extends Animal{
    private String color;
    private double weight;

    public Dog(char sex, short age, String color, double weight) {
        super("狗", sex, age);
        setColor(color);
        setWeight(weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void showInfo(){
        super.showInfo();//使用super关键字调用父类的showInfo()方法
        System.out.println("该狗狗的颜色是"+color+"的，"+"体重是"+weight+"kg.");
    }
}
