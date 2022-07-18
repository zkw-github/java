package com.student.zhaokangwei08.d7;

public class HomeWork08 {
    public static void main(String[] args) {
        printStars(3,5);
        System.out.println("面积为："+rectangleArea(3,5));
    }
    public static void printStars(int x,int y){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print("☆");
            }
            System.out.println();
        }


    }
    public static int rectangleArea(int width,int height){
        return width*height;
    }
}
