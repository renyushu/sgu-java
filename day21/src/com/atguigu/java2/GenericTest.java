package com.atguigu.java2;

import com.atguigu.java.Order;
import org.junit.Test;

import java.time.Period;
import java.util.Iterator;
import java.util.List;

/**
 * 1. 泛型在继承方面的体现
 *
 * 2. 通配符的使用： ？
 *
 *
 */

public class GenericTest {

    @Test
    public void test1() {
        List<Object> list1 = null;
        List<String> list2 = null;

        //?表示通配符，既可以表示匹配Object， 也可以匹配String
        List<?> list = null;

        list = list1;
        list = list2;
    }

    public void print(List<?> list) {
        Iterator<?>  iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
        }
    }

    @Test
    public void test4() {
        //Person以及Person的子类
        List<? extends Person> list1 = null;
        //
        List<? super Person> list2 = null;

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
//        list1 = list5;

    }
}
