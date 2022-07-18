package com.student.zhaokangwei16.d15;

/**
 * 运动员类（子类）
 */
public class Athlete extends Person {
    private String item;//运动项目
    private String bestResult;//最好成绩

    public Athlete(String name, short age, char sex, String item, String bestResult) {
        super(name, age, sex);
        setItem(item);
        setBestResult(bestResult);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getBestResult() {
        return bestResult;
    }

    public void setBestResult(String bestResult) {
        this.bestResult = bestResult;
    }
    public void introduce(){
        System.out.println("大家好，我是"+getName());
        System.out.println("今年"+getAge());
        System.out.println("我最擅长的项目是："+getItem());
        System.out.println("历史最好成绩是："+getBestResult());
    }
}
