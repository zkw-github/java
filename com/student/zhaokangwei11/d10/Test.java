package com.student.zhaokangwei11.d10;

public class Test {
    public static void main(String[] args) {
       IT it= new IT();
       it.setName("马未龙");
       it.setAge((short) 35);
       it.setTechnicalDirection("数据库维护");
       it.setWorkingYears((byte) 10);
       it.setTakeOffice("腾讯实业");
       it.setPosition("数据库维护工程师");
       it.outputInformation();
        System.out.println("============================================");
        IT it2= new IT("张凯",(short)15,"Java开发",(byte)15,
                "鼎盛科技","Java开发工程师");
        it2.outputInformation();

    }
}
