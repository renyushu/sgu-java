package com.atguigu.java;

import org.junit.Test;

public class StringTest {

    @Test
    public void test3(){

    }

    @Test
    public void test2(){

    }

    /**
     *
     */
    @Test
    public void test1(){
        String s1 = "abc";//字面量
        String s2 = "abc";
        System.out.println(s1 == s2); //内存中指向同一个地址
        s1 = "hello";

        System.out.println(s1);
        System.out.println(s2);
    }
}
