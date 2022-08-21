package com.atguigu.java3;

/*
类的成员之四： 代码块
    1.代码块的作用：用来初始化类、对象
    2.代码块如果有修饰的话，只能使用static
    3.分类：静态代码块 vs 非静态代码块
    4.静态代码块
        >内部可以有输出语句
        > 随着类的加载而执行,而且只执行一次

    5.非静态代码块
            >内部可以有输出语句
            > 随着对象的创建而执行
            >每创建一个对象，就执行一次非静态代码块
            >作用：可以在创建对象时，对对象的属性等进行初始化

 对属性可以赋值的位置：
 1 默认初始化
 2 显示初始化
 3 构造器中初始化
 4 有了对象以后，可以通过"对象.属性" 或 "对象.方法" 的方式，进行赋值
 5 在代码块中赋值

 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
        Person p2 = new Person();

    }
}

class Person {
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person() {

    }
    //static的代码块
    static {
        System.out.println("static的代码块");
    }
    //非静态的代码块
    {
        System.out.println("代码块");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person [name= " + name + ", age=" + age + "]";
    }
}