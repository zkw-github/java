package com.student.zhaokangwei24.d23.entity;

public class Notice implements IDisplay{
    String content;//通知内容

    public Notice(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("通知内容："+content);
    }
}
