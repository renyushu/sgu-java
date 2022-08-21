package com.atguigu.java3;

import com.atguigu.java2.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 */
public class SetTest {

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom", 10));
        set.add(88);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    //LinkedHashSet的使用
    //LinkedHashSet作为HashSet的子类，在添加输的同时，每个数据还维护了两个引用，记录此数据前后两个引用
    //数据和后一个数据
    //优点：对于频繁的遍历操作LinkedHashSet效率较高
    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom", 10));
        set.add(88);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
