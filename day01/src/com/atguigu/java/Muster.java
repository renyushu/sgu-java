package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
    public  static void main(String args[]) {
        Collection<String> list = new ArrayList<>(); //实例化集合类对象
        list.add("《java从入门到精通》"); //向集合添加数据
        list.add("Python入门");
        list.add("go入门教程");
        Iterator<String> it = list.iterator(); //创建迭代器
        while (it.hasNext()) { // 判断是否有下一个元素
            String str = (String) it.next(); //获取集合中元素
            System.out.println(str); //
        }

    }
}
