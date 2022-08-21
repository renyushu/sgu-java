package com.atguigu.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/***
 *
 * 总结：常用方法
 * 增：
 * 删：
 * 改：
 * 查：
 * 插：
 * 长度：
 * 遍历：
 *
 */
public class ListTest {

    @Test
    public void test3() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Rick", 18));
        list.add(456);

        //方式1： Iterator迭代器方式
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*******************************");

        //方式2：foreach
        for(Object obj: list){
            System.out.println(obj);
        }
        System.out.println("*******************************");
        //普通for
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Rick", 18));
        list.add(456);

        System.out.println(list);

        //返回元素首次出现的位置
        int index = list.indexOf(4256);
        System.out.println(index);

        //返回元素最后一次出现的位置
        int index1 = list.lastIndexOf(45006);
        System.out.println(index1);

        //移除指定位置的元素
        Object obj = list.remove(0);
        System.out.println(obj);

        list.set(1, "setEle1");
        System.out.println(list);

    }

    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Rick", 18));
        list.add(456);

        System.out.println(list);
        //add
        list.add(1, "addIndex1");
        System.out.println(list);

        //addAll
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);

        //get
        System.out.println(list.get(0));
    }
}
