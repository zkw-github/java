package com.student.zhaokangwei11.d10;

public class IT {
    private String name;
    private short age;
    private String technicalDirection;
    private byte workingYears;
    private String takeOffice;
    private String position;
    public IT(){}

    public IT(String name, short age, String technicalDirection, byte workingYears, String takeOffice, String position) {
        this.name = name;
        this.age = age;
        this.technicalDirection = technicalDirection;
        this.workingYears = workingYears;
        this.takeOffice = takeOffice;
        this.position = position;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(short age){
        this.age=age;
    }
    public void setTechnicalDirection(String TechnicalDirection){
        this.technicalDirection=TechnicalDirection;
    }
    public void setWorkingYears(byte workingYears){
        this.workingYears=workingYears;
    }
    public void setTakeOffice(String takeOffice){
        this.takeOffice=takeOffice;
    }
    public void setPosition(String position){
        this.position=position;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public String getTechnicalDirection() {
        return technicalDirection;
    }

    public byte getWorkingYears() {
        return workingYears;
    }

    public String getTakeOffice() {
        return takeOffice;
    }

    public String getPosition() {
        return position;
    }
    public void outputInformation(){
        System.out.println("姓名："+getName()+"\n"+"年龄："+getAge()+"\n"+"技术方向："
                +getTechnicalDirection()+"\n"+"工作年限："+getWorkingYears()
        +"\n"+"就职于："+getTakeOffice()+"\n"+"职务："+getPosition());
    }
}
