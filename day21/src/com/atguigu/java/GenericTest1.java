package com.atguigu.java;

import org.junit.Test;

/**
 * 1. 关于自定义泛型类、泛型接口
 *
 *
 */
public class GenericTest1 {
    @Test
    public void test1() {
        //如果定了一泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定了已类是带泛型的，建议在实例化时要指明类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");


        //建议： 实例化时指明类的泛型
        Order<String> order1 = new Order<String>("orderAA", 1001, "order:AA");
        order1.setOrderT("AA:hello");
    }

    @Test
    public void test2() {
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型
        sub1.setOrderT(1122);

        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2...");
    }
}
