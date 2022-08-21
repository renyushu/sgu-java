package com.atguigu.java2;

import org.junit.Test;

public class WrapperTest {
    /*
    JDK 5.0 新特性： 自动装箱与自动拆箱
     */
    //String类型 ---> 基本数据类型、包装类: 调用包装类的 parseXxx();
    @Test
    public void test5() {
        String str1 = "123";

        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 99);
    }

    //基本数据类型、包装类 ---> String 类型
    @Test
    public void test4() {
        int num1 = 10;
        //方式1： 连接运算
        String str1 = num1 + "";
        System.out.println(str1);
        System.out.println(str1 instanceof String);

        //方式2: 调用String重载的valueOf(xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2);
    }

    @Test
    public void test3() {
        //自动装箱
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1; //自动装箱

        //自动拆箱: 包装类 ---> 基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;
        System.out.println(num3);

    }

    //包装类 ---> 基本数据类型: 调用包装类的xxxValue()
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1+12);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }
    //基本数据类型 -> 包装类
    @Test
    public void test1() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");

        System.out.println(b2);
        System.out.println(b3); //false

        Order order = new Order();
        System.out.println(order.isFemale); // null,是一个对象而不是基本数据类型
        System.out.println(order.isMale); //false
    }
}

class Order {
    boolean isMale;
    Boolean isFemale;
}