package com.atguigu.exer;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }
}

abstract class Person {
    public abstract void run();
}

class Student extends Person {

    @Override
    public void run() {
        System.out.println("student");
    }
}