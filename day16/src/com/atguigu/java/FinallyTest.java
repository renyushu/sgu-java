package com.atguigu.java;

import org.junit.Test;

/**
 * try-catch-finally
 *  1. finally是可选的
 *  2. finally中声明的是一定会执行的代码。即使catch中又出现异常了，try中有return语句，catch中有return语句等情况。
 *  3. 什么情况下使用finally
 *         数据库链接、输入输出流
 *
 *
 */
public class FinallyTest {
    @Test
    public void test3() {

    }

    @Test
    public void test2() {
        int result = method1();
        System.out.println(result);
    }

    public int method1() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会执行");
//            return 3;
        }
    }
    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch(ArithmeticException e) {
//            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }
}
