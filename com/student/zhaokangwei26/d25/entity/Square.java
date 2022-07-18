package com.student.zhaokangwei26.d25.entity;

/**
 * 矩形类实现图形接口
 */
public class Square implements Ishape{
    private float width;//矩形长
    private float height;//矩形的宽

    public Square(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void show() {
        System.out.println("这是一个矩形，宽度是："+width+",高度是："+height);
    }

    @Override
    public float calcArea() {
        return width*height;
    }

    @Override
    public float calcGirth() {
        return (width+height)*2;
    }
}
