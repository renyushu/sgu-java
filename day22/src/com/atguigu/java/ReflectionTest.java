package com.atguigu.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    //反射之前，对于Person的操作
    @Test
    public void test1() {
        //1.创建Person的对象
        Person p1 = new Person("Tome", 12);

        //2.通过对象，调用其内部的属性、方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        // 在Person外部，不可以通过Person对象调用其私有结构
        // 比如：name、 showNation() 以及私有的构造器
    }

    // 反射之后，对于Person的操作
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class claxx = Person.class;
        // 1.通过反射创建对象
        Constructor cons = claxx.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p.toString());
        // 2.通过反射，调用对象指定的属性、方法
        // 调用属性
        Field age = claxx.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p.toString());
        // 调用方法
        Method show = claxx.getDeclaredMethod("show");
        show.invoke(p);
        // 通过反射，可以调用Person类的私有结构。 比如：方法、属性、构造器

        System.out.println("*************************************************");

        //调用私有的构造器
        Constructor cons1 = claxx.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("Rick");
        System.out.println(p1);

        //调用私有的属性
        Field name = claxx.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "JackMa");
        System.out.println(p1);

        // 调用私有的方法
        Method showNation = claxx.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");
        System.out.println(nation);


    }
    /**
     * 关于java.lang.Class类的理解
     *
     * 1. 类的加载过程
     * 程序经过javac.exe命令以后，会生成一个或多个字节码文件（.class结尾）
     * 结构我们使用java.exe命令对 某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中
     * 此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此运行时类，就作为Class的一个实例
     *
     * 2.换句话说，Class的实例就对应着一个运行时类。
     *
     * 3.加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式来获取此运行时类
     *
     *
     */

    // 获取Class的实例方法
    @Test
    public void test3() throws ClassNotFoundException {
        //方式1:调用运行时类的属性： .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);
        //方式2：通过运行时类的对象
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz1);
        // 方式3： 调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("com.atguigu.java.Person");
        System.out.println(clazz3);

        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class  clazz4 = classLoader.loadClass("com.atguigu.java.Person");
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz4);

    }


    @Test
    public void test4() {

    }


    /**
     * 创建一个指定类的对象
     * classPath: 指定类的全名
     */
    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }

    @Test
    public void test5() {
        Class c1 = Object.class; // 获取Class类的实例
        System.out.println(c1);
    }
}
