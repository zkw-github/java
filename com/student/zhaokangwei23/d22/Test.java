package com.student.zhaokangwei23.d22;

import com.student.zhaokangwei23.d22.entity.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Army army=new Army("德军",new Tank("90坦克"));
        army.move();
        army.attack();
        System.out.println("------------------------------------------");
        Army army1=new Army("美军",new Flighter("F22战机"));
        army1.move();
        army1.attack();
        System.out.println("------------------------------------------");
        Army army2=new Army("中国军", new WarShip("航母战舰"));
        army2.move();
        army2.attack();

    }
}
