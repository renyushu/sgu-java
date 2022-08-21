package com.atguigu.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.method2();
        s.method3();

        //接口定义的静态方法，只能通过接口调用
        CompareA.method1();
    }
}

class SubClass implements CompareA {

}