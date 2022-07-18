package com.student.zhaokangwei12.d11;

/**
 * 动物类（父类）
 */
public class Animal {
    private String type;
    private char sex;
    private short age;

    public Animal(String type, char sex, short age) {
        setType(type);
        setSex(sex);
        setAge(age);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex!='雄'&&sex!='雌')
        {
            sex='雄';
        }
        this.sex=sex;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
       if(age<0){
           age=0;
       }
       this.age=age;
    }
    public void showInfo(){
        System.out.println("这个动物是"+type+"的，性别是"+sex+"的，年龄是"+age);
    }
}
