package com.atguigu.java2;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 *  集合中的常用方法
 *
 *  向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
 *
 *
 */
public class CollectionTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList(); //ArrayList实现了Collection接口

        //add(Object e): 将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //size()：获取添加的元素的个数
        System.out.println(coll.size());

        //addAll(Collection coll1): 将coll1集合中的元素添加到当前的集合
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

        //清空结合元素
        coll.clear();

        //isEmpty(): 判断当前集合是否为空
        System.out.println(coll.isEmpty());

        //contains(object obj): 判断当前的集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()
        Collection coll2 = new ArrayList();
        coll2.add(111);
        coll2.add(234);
        coll2.add(new String("Tom"));
        coll2.add(false);
        coll2.add(new Person("Jerry", 20));
        boolean contains = coll2.contains(123);
        System.out.println(contains);


        //containsAll(Collection coll1): 判断形参coll1中的所有元素是否都存在于当前集合中
        Collection c = Arrays.asList(111, 234);
        System.out.println(c.containsAll(c)); // true

    }

    @Test
    public void test2() {
        //3. remove(Object obj)
        Collection c = new ArrayList();
        c.add(123);
        c.add(345);
        c.add(new String("Tom"));
        c.add(new Person("Jerry", 20));
        c.add(false);

        c.remove(999);

        System.out.println(c);


    }
}
