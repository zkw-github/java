package com.student.zhaokangwei27.d26.excercise;

/**
 * 学习包装类
 */
public class Demo {
    public static void main(String[] args) {
        //OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerStaticClass innerStaticClass=new OuterClass.InnerStaticClass();

//      int a = Integer.parseInt("123");
//        System.out.println(a);
//        Byte b=Byte.parseByte("127");
//        System.out.println(b);
//        short c=Short.parseShort("30000");
//        System.out.println(c);
//        int d=Integer.parseInt("12345");
//        System.out.println(d);
//        float e=Float.parseFloat("1235.6");
//        System.out.println(e);
//       double h= Double.parseDouble("12664.5");
//        System.out.println(h);
//        Boolean bool=Boolean.parseBoolean("abc");
//        System.out.println(bool);
//      Byte aByte  =new Byte((byte) 1);
//      byte a=aByte.byteValue();
//     short b= aByte.shortValue();
//     int c=aByte.intValue();
//     float d=aByte.floatValue();
//     double e=aByte.doubleValue();
//        System.out.println(e);
//      Short aShort  =new Short((short)123);
//      byte i=aShort.byteValue();
//      short j=aShort.shortValue();
//      int k=aShort.intValue();
//      float m=aShort.floatValue();
//      double h=aShort.doubleValue();
//        System.out.println(h);
//      Integer integer= new Integer(12);
//      byte a=integer.byteValue();
//      short b=integer.shortValue();
//      int c= integer.intValue();
//      float d=integer.floatValue();
//      double f=integer.doubleValue();
//        System.out.println(f);
//      Long along= new Long(125);
//     byte a= along.byteValue();
//     short b=along.shortValue();
//    int c= along.intValue();
//    float d=along.floatValue();
//    double e= along.doubleValue();
//        System.out.println(e);
//      Float aFloat=new Float("15479665.5f");
//      Double aDouble =new Double(1234679758.5);
//      Character character =new Character('a');
//      Boolean bool =new Boolean(true);

    }
    static Number add(Number a,Number b){
        return a.doubleValue()+b.doubleValue();
    }
}
