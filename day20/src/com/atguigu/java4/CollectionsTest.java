package com.atguigu.java4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Collections: 操作Collection、Map的工具类
 *
 *
 */
public class CollectionsTest {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        list.add(999);
        list.add(999);
        list.add(999);
        list.add(999);
        list.add(333);


        System.out.println(list);

//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
        //交换
//        Collections.swap(list, 1, 2);
        //元素出现的次数
        int fre = Collections.frequency(list, 999);
        System.out.println(list);
        System.out.println(fre);
    }
}
