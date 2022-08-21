package com.atguigu.java;

/**
 * 泛型的使用
 * 1. jdk5.0新增的特性
 *
 * 2.在集合中使用泛型：
 * 总结：
 * 1》集合接口或集合在jdk5.0时都修改为带泛型的结构
 * 2》在实例化集合类时，可以指明具体的泛型类型
 * 3》指明完以后，在集合类或接口中凡是定义类或接口时，内部结构使用到类的泛型的位置，
 *      都指定为你实例化时的类型
 *      比如：add(E e) --> add(Integer e)
 *
 *  4》注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，使用包装类替换
 *  5》如果实例化时，没有指明泛型的类型，默认类型为： java.lang.Object类型
 *
 * 3.如何自定义泛型结构：泛型类、接口、方法
 *
 */

import org.junit.Test;

import java.util.*;

public class GenericTest {

    //在集合中使用泛型之前的情况
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(78);
        list.add(100);
        list.add(99);
        list.add(11);
        //问题1： 类型不安全
        //需要在添加的时候做一个类型检查来避免此类为题
//        list.add("Tom");

        for(Object score : list) {
            //问题2： 强转时，可能出现ClassCastException
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }

    }

//    在集合中使用泛型的情况
    @Test
    public void test2() {
        //泛型不能是基本数据类型

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(99);
        list.add(88);
        list.add(22);
        //使用泛型在编译时就会进行数据检查，保障数据的安全
//        list.add("100");

        //方式1
//        for(Integer score: list) {
//            int stuScore = score;//避免强转操作
//            System.out.println(stuScore);
//        }

        //方式2
       Iterator<Integer> iterator =  list.iterator();
       while (iterator.hasNext()) {
          int stuScore =  iterator.next();
          System.out.println(stuScore);
       }


    }

    //在集合中使用泛型的情况: 以hashMap为例
    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 87);
        map.put("Jerry", 97);
        map.put("Jack", 27);
        map.put("Rick", 77);

//        map.put(123, 99);
        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry1 = iterator.next();
            String key = entry1.getKey();
            Integer value = entry1.getValue();
            System.out.println(key + "----> " + value);
        }



    }

}
