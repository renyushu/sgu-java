package com.atguigu.java2;

import org.junit.Test;

/*
关于包装类使用的面试题
 */
public class InterviewTest {
    @Test
    public void test1() {
        Object o1 = true? new Integer(1) : new Integer(2);
        System.out.println(o1);
    }
}
