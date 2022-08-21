package com.atguigu.java;

import org.junit.Test;

public class ExceptionTest {
    //NullPointerException
    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr[3]);
    }
}
