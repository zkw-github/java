package com.student.zhaokangwei24.d23.entity;

public class Ad implements IDisplay{
    private String information;//广告消息

    public Ad(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public void display() {
        System.out.println("广告消息："+information);
    }
}
