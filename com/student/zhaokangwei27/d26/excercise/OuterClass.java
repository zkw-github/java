package com.student.zhaokangwei27.d26.excercise;

/**
 * 外部类
 */
public class OuterClass {
    /**
     * 内部类
     */
    public OuterClass() {
        System.out.println("这是外部类OuterClass的构造方法。。。");
        InnerClass innerClass=new InnerClass();

    }

    /**
     * 成员内部类
     */
    class InnerClass{
        /**
         * 内部类的构造方法
         */
        public InnerClass() {
            System.out.println("这是内部类InnerClass实例了。。。");
        }
    }

    /**
     * 静态内部类
     */
    static class InnerStaticClass{
        public InnerStaticClass(){
            System.out.println("静态内部类InnerStaticClass实例了。。。");
        }
    }

}
