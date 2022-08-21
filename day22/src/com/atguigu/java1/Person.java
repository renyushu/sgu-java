package com.atguigu.java1;

@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface{
    private String name;
    int age;
    public int id;

    public Person(){}

    @MyAnnotation(value = "constructor")
    private Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    @MyAnnotation
    private String show(String nation) {
        System.out.println("我的国籍是: " + nation);
        return nation;
    }

    public String display (String interests) throws NullPointerException, ClassCastException  {
        return interests;
    }

    public String p(String name, String sex) {
        return name + sex;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
