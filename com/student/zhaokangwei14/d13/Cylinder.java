package com.student.zhaokangwei14.d13;

public class Cylinder {
    private double radius;
    private double height;
    final double PI=3.1415926;
    public Cylinder(double radius,double height){
        setRadius(radius);
        setHeight(height);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return PI*radius*radius*height;
    }
    public void showVolume(){
        System.out.println("圆柱体体积为："+getVolume());
    }


}
