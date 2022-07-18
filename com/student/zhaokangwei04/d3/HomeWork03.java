package com.student.zhaokangwei04.d3;

public class HomeWork03 {
    public static void main(String[] args) {
        int x,y;
        x=3;
        y=6;
        if(x>y){
            System.out.println("x>y");
        }else{
            System.out.println("x<y");
        }
        x+=2;
        y-=3;
        System.out.println(x);
        System.out.println(y);
        if(x>2&&y<4)
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        if(x>3||y<5){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        if(x>2&&(y>2||y<5)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        boolean z=x>2||y<5?true:false;
        System.out.println(z);
    }

}
