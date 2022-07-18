package com.student.zhaokangwei30.d29;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random=new Random();
        for(int i=0;i<10;i++){
            //int a=(random.nextInt(900)+100);//100-999
            double a=random.nextDouble();
            float b=random.nextFloat();
            long c=random.nextLong();
           boolean d =random.nextBoolean();
            System.out.println(d);
        }
    }
}
