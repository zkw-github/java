package com.student.zhaokangwei26.d25;

import com.student.zhaokangwei26.d25.entity.Circle;
import com.student.zhaokangwei26.d25.entity.Ishape;
import com.student.zhaokangwei26.d25.entity.Square;

import java.util.Scanner;
class NiMing{

}
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Ishape shape;
        System.out.println("1.创建一个矩形");
        System.out.println("2.创建一个圆形");
        System.out.println("3.其它形状待开发");
        System.out.println("4.退出系统");
        System.out.print("请输入功能项：");
        byte shapeType=scanner.nextByte();
        switch (shapeType){
            case 1:
                //我们要创建一个举行对象
                System.out.print("请输入矩形的宽：");
                float width=scanner.nextFloat();
                System.out.print("请输入矩形的高：");
                float height=scanner.nextFloat();
                shape =new Square(width,height);
                break;
            case 2:
                //我们创建一个圆形对象
                System.out.print("请输入圆的半径");
                float radius=scanner.nextFloat();
                shape=new Circle(radius);
                break;
            default:
                System.out.println("输入错误！");
                return;
        }
        System.out.println("********图形类对象管理*******");
        shape.show();
        System.out.println("面积: "+shape.calcArea());
        System.out.println("周长: "+shape.calcGirth());
        /**
         * 大括号代表就是匿名类
         */
//        new NiMing() {
//            /**
//             * 这是匿名类的方法
//             */
//            void ShowNiMing(){
//                System.out.println("这是匿名类中的ShowNiMing()方法");
//            }
//        }.ShowNiMing();




    }
}
