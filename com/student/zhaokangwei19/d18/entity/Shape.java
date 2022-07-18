package com.student.zhaokangwei19.d18.entity;

/**
 * 图形类（父类）
 */
public abstract class Shape {
    public int width;
    public int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
   public abstract double graphicArea();
    public abstract double getGirth();

}
