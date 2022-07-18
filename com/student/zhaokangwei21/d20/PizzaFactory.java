package com.student.zhaokangwei21.d20;

import com.student.zhaokangwei21.d20.entity.BaconPizza;
import com.student.zhaokangwei21.d20.entity.Pizza;
import com.student.zhaokangwei21.d20.entity.SeafoodPizza;

import java.util.Scanner;

public class PizzaFactory {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Pizza pizza;
        String name;
        System.out.print("请输入想要制作的比萨(1.培根比萨 2.海鲜比萨)：");
        byte pizzaType= input.nextByte();
        System.out.print("请输入比萨大小：");
        byte size=input.nextByte();
        System.out.print("请输入比萨价格：");
        float price=input.nextFloat();
        if(pizzaType==1){
            System.out.print("请输入培根克数：");
            byte baconGram=input.nextByte();
            pizza=new BaconPizza(price,size,baconGram);

        }else if(pizzaType==2){
            System.out.println("请输入配料信息：");
            String  burden=input.next();
            pizza=new SeafoodPizza(price,size,burden);
        }else{
            System.err.println("输入错误！！！");
            pizza=null;
        }
        pizza.show();


    }
}
