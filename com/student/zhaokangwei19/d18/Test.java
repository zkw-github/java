package com.student.zhaokangwei19.d18;

import com.student.zhaokangwei19.d18.entity.Shape;
import com.student.zhaokangwei19.d18.entity.Square;
import com.student.zhaokangwei19.d18.entity.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Shape shape;
        System.out.print("图形是：矩形/三角形:");
        String type=input.next();
        switch (type){
            case "矩形":
                shape=new Square(5,3);
                break;
            case "三角形":
                shape=new Triangle(6,3);
                break;
            default:
                System.err.println("输入错误！！！");
                shape=null;
                break;
        }
        System.out.println("面积是："+shape.graphicArea());

    }
}
