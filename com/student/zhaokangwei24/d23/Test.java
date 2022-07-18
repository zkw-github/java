package com.student.zhaokangwei24.d23;

import com.student.zhaokangwei24.d23.entity.Ad;
import com.student.zhaokangwei24.d23.entity.Car;
import com.student.zhaokangwei24.d23.entity.IDisplay;
import com.student.zhaokangwei24.d23.entity.Notice;

public class Test {
    public static void main(String[] args) {
        IDisplay notice =new Notice("由于下午可能下大雨，下午休假");
        notice.display();
        IDisplay car=new Car((byte) 25);
        car.display();
        IDisplay ad=new Ad("走过不要错过，样样25元");
        ad.display();

    }
}
