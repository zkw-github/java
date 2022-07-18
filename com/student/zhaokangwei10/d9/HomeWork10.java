package com.student.zhaokangwei10.d9;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
    public static long factorial(int n){
        if (n==1)
            return 1;
        else
            return factorial(n-1)*n;
    }
}
