package com.atguigu.java;



import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(233);
        list.add(88);

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    @Test
    public void test2() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        int i = (int) (Math.random() * list.size()); //
        System.out.println(list.get(i));
        System.out.println("随机获取的元素: " + list.get(i));
        list.remove(2);
        System.out.println("将索引是'2' 的元素从集合移除后，集合的元素是：");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }
    @Test
    public void test3() {
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            z++;
        }
        if ((x = false) || (++z == 43)) {
            z++;
        }
        System.out.println("z = " + z);
    }

    @Test
    public void test4() {
        String[] str = new String[5];
        System.out.println(str);
    }
}
