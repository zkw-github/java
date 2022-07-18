package com.student.zhaokangwei19.d18.entity;

/**
 * 矩形类（子类）
 */
public class Square extends Shape{

    public Square(int width, int height) {
        super(width, height);
    }
    @Override
    public double graphicArea(){
        return width*height;
    }

    @Override
    public double getGirth() {
        return 0;
    }
}
