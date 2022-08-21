package com.atguigu.java1;

public class AnnotationTest {

}

@MyAnnotation(value = "hello")
class Person{
    private String name;
    private int age;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void walk(){
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}

class Student extends Person{
    @Override
    public void walk() {
        System.out.println("Student走路");
    }
}