package com.atguigu.java4;

import org.junit.Test;

import java.util.*;

/**
 * map存储具有映射关系的key-value
 */

public class MapTest {
    @Test
    public void test1() {
        Map map = new HashMap();

        map.put(null, 123);

        System.out.println(map);

    }

    @Test
    public void test11() {
        Map<String, String> map = new HashMap();
        map.put("name", "rick");
        System.out.println(map);
    }

    @Test
    public void test2() {
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put("BB", "rick");
        map.put("CC", 111);
        //修改
        map.put("CC", 222);

        System.out.println(map);
        Map map1 = new HashMap();
        map1.put("DD", 123);
        map1.put("EE", 123);
        map.putAll(map1);
        System.out.println(map);

        //remove(Object key)
        Object value = map.remove("BB");
        System.out.println(value);

        //clear
         map.clear();
         System.out.println(map.size());

    }

    @Test
    public void test3(){
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put("BB", "rick");
        map.put("CC", 222);
        map.put("DD", 222);

        //get
        System.out.println(map.get("AAA")); //null

        //containsKey
        boolean isExist = map.containsKey("BBB");
        System.out.println(isExist);
        //containsValue
        boolean isExistValue = map.containsValue(222);

        System.out.println(isExistValue);

        map.clear();
        System.out.println(map.isEmpty());
    }

    @Test
    public void test4(){
        Map map = new HashMap();
        //添加
        map.put("AA", 123);
        map.put("BB", "rick");
        map.put("CC", 222);
        map.put("DD", 222);

        //遍历所有的key集： keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //遍历所有的value: values()
        Collection vaules = map.values();
        for(Object obj: vaules) {
            System.out.println(obj);
        }

        //方式1: 遍历所有的key - value
        //entrySet():
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "------> " + entry.getValue());
        }

        //方式2:遍历所有的key - value
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "=====" + value);
        }

    }
}
