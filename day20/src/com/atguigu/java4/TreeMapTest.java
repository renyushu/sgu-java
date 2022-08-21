package com.atguigu.java4;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    //向TreeMap中添加key-value,要求key必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    @Test
    public void test1() {
        TreeMap map = new TreeMap();
        User u1 = new User("Tom", 22);
        User u2 = new User("Pony", 211);
        User u3 = new User("Jack", 200);
        User u4 = new User("Robin", 99);

        map.put(u1, 99);
        map.put(u2, 89);
        map.put(u3, 79);
        map.put(u4, 109);

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();

        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-----> " + entry.getValue());
        }
    }
}
