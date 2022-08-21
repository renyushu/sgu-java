package com.atguigu.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 1. 内部的方法：hasNext() 和next()
 * 2. 集合对象每次调用Iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
 * 3. 内部定义了remove(), 可以在便利的时候，删除集合中的元素。
 *
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
//        方式1
//        Syst em.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        //方式2：不推荐
//        for(int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式3：推荐
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }


    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();

    }

    //测试Iterator中的remove
    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //删除集合中"Tom"这个数据
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            Object obj = iterator.next();
            if("Tom".equals(obj)) {
                iterator.remove();
            }
        }

        //遍历集合
        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}
