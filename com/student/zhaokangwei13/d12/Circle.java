package com.student.zhaokangwei13.d12;

public class Circle {
    private double radius;//存放圆的半径
    final double PI=3.1415926;//圆周率

    /**
     *圆的无参构造方法
     */
    public Circle(){
        radius=0;
    }

    /**
     * 带一个参数的圆的构造方法
     * @param radius
     */
    public Circle(double radius){
        this.radius=radius;
    }

    /**
     * 接收参数，完成对圆半径的赋值
     * @param radius
     */
    public void setRadius(double radius){
        this.radius=radius;
    }

    /**
     * 获取圆半径
     * @return
     */
    public double getRadius(){
        return radius;
    }

    /**
     * 获取圆的面积
     * @return
     */
    public double getArea(){
        return PI*radius*radius;
    }

    /**
     * 获取圆的周长
     * @return
     */
    public double getPerimeter(){
        return  2*PI*radius;
    }

    /**
     * 显示圆半径、圆周长、圆面积
     */
    public void show(){
        System.out.println("圆半径："+getRadius()+"\n"+"圆周长："
                +getPerimeter()+"\n"+"圆面积："+getArea());
    }
}
