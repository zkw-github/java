package com.student.zhaokangwei26.d25.entity;
class NiMing{

}
public class Circle implements Ishape{
    private float radius;//圆半径
    final float PI=3.14f;//圆周率

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void show() {
        System.out.println("这是一个圆形，半径是："+radius);
    }

    @Override
    public float calcArea() {
        return radius*radius*PI;
    }

    @Override
    public float calcGirth() {
        return radius*2*PI;
    }
}
