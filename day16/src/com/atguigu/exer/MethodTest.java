package com.atguigu.exer;

public class MethodTest {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.age = 5;
        System.out.println("change: 修改之前的age = " + obj.age);
        change(obj);
        System.out.println("change: 修改之后的age = " + obj.age);
    }

    public static void change(Person obj) {
        System.out.println("change: 修改之前的age = " + obj.age);
        obj.age = 99;
        System.out.println("change: 修改之后的age = " + obj.age);
    }
}
