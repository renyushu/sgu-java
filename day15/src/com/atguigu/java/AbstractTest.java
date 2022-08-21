package com.atguigu.java;

/**
 * abstract关键字的使用
 *  1. abstract：抽象的
 *  2. abstract可以用来修饰的结构：类、方法
 *
 *  3. abstract修饰类：抽象类
 *      》此类不能实例化
 *      》抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程)
 *      》开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 *  4. abstract修饰方法：抽象方法
 *      》抽象方法只有方法的声明，没有方法体
 *      》包含抽象方法的类一定是抽象类
 *      》若子类重写了父类中的所有抽象方法方可实例化，若子类没有重写父类中所有的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰一下
 *
 *
 *
 */
public class AbstractTest {

}

abstract class Person{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void walk() {
        System.out.println("人走路");
    }
    //抽象方法
    public abstract  void study();
}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("学习");
    }
}

