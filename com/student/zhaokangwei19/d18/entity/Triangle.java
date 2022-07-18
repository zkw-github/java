package com.student.zhaokangwei19.d18.entity;

/**
 * 三角形类（子类）
 */
public class Triangle extends Shape{
    public Triangle(int width, int height) {
        super(width, height);
    }
    @Override
    public double graphicArea(){
        return (width*height)/2;
    }

    @Override
    public double getGirth() {
        return 0;
    }
}
