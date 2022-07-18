package com.student.zhaokangwei22.d21;

import com.student.zhaokangwei22.d21.entity.Coffee;
import com.student.zhaokangwei22.d21.entity.Cola;
import com.student.zhaokangwei22.d21.entity.Drink;
import com.student.zhaokangwei22.d21.entity.MineralWater;

import java.util.Scanner;

public class BeveragePurchase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        byte capacity;
        Drink drink;
        String burden;
        String type ;
        System.out.print("请选择饮料(1、咖啡 2、矿泉水 3、可乐):");
        byte drinkType= input.nextByte();
        System.out.print("请输入购买容量：");
        capacity=input.nextByte();
        if(drinkType==1){
            System.out.print("请问是否要配料：（1、加糖 2、加奶 3、什么都加）");
            byte burdenNum=input.nextByte();
            if(burdenNum==1){
                 burden="加糖";
            }else if(burdenNum==2){
                 burden="加奶";
            }else if(burdenNum==3){
                 burden="什么都加";
            }else{
                System.err.println("输入错误！！！");
                burden=null;
            }
            drink=new Coffee(capacity,burden);

        }else if(drinkType==2){
            drink=new MineralWater(capacity);
        }else if(drinkType==3){
            System.out.print("请选择可乐类型：（1、可口可乐 2、百事可乐）");
            byte colaType=input.nextByte();
            if(colaType==1){
                type="可口可乐";
            }else if(colaType==2){
                type="百事可乐";
            }else{
                System.err.println("输入错误！！！");
                type=null;
            }
            drink=new Cola(capacity,type);
        }else{
            System.err.println("输入错误！！！");
            drink=null;
        }
        drink.show();
    }
}
