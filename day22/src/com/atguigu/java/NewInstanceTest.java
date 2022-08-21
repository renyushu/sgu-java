package com.atguigu.java;

import org.junit.Test;

import java.util.Random;

/**
 * 通过反射创建对应的运行时类的对象
 *
 */

public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        //newInstance()： 调用此方法，创建对应的运行时类的对象。内部是调用了运行时类的空参构造器

        Object obj = clazz.newInstance();
        System.out.println(obj);
    }

    // 体会反射的动态性
    @Test
    public void test2() {
        int num = new Random().nextInt(3); // 0, 1, 2
        String classPath = "";
        switch (num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "com.atguigu.java.Person";
                break;
        }

        try {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
    创建一个指定类的对象
    classPath: 指定类的全名
     */
    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
