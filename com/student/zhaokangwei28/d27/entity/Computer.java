package com.student.zhaokangwei28.d27.entity;

/**
 * 创建一个电脑类Computer，有两个属性，一个电脑品牌和CPU（注意这里的CPU不是字符串类型，
 * 而是后面创建的CPU类对象）。在电脑类里面创建一个成员内部类————CPU类，
 * CPU类有品牌、型号、核数等属性，其中核数类型要求使用包装类（自行思考选择哪个包装类）；
 * 要求在实例电脑类的时候实例一个CPU类。
 *
 * 要求：在实例电脑的时候，需要传一个构造参数（电脑品牌，CPU品牌，CPU型号，CPU核数），
 * 然后再CPU类里创建一个方法showCPUInfo()用于输出CPU的品牌和型号。然后再给电脑类添加一个方法showComputerInfo()，
 * 在该方法里调用CPU的showCPUInfo()方法。
 */

/**
 * 电脑类，即外部类
 */
public class Computer {
    private String brand;
    private CPU cpu;

    public Computer(String brand, String brand2, String type, Byte numberOfCores) {
        this.brand = brand;
        cpu=new CPU(brand2,type,numberOfCores);
    }

    /**
     * 成员内部类——CPU
     */
    class CPU{
       private String brand2;//CPU品牌
       private String type;//CPU型号
         private Byte numberOfCores;//CPU核数

        public CPU(String brand2, String type, Byte numberOfCores) {
            this.brand2 = brand2;
            this.type = type;
            this.numberOfCores = numberOfCores;
        }
        public void showCPUInfo(){
            System.out.println("CPU品牌是：" + brand2 + ",型号是：" + type + ",核数是："+numberOfCores+"核");
        }
    }
    public void showComputerInfo(){
        System.out.println("电脑品牌："+brand);
        cpu.showCPUInfo();
    }
}
