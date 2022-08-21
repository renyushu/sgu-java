package com.atguigu.java;

/**
 * 多线程的创建：方式1： 继承于Thread类
 *      1. 创建一个继承于Thread的子类
 *      2. 重写Thread类的run() --> 此现成执行的操作
 *      3. 创建Thread类的子类的对象
 *      4. 通过此对象调用start()
 */

public class ThreadTest {
    public static void main(String[] args) {
        // 3. 创建Thread类的子类的对象
        System.out.println("flag....");

        MyThead t1 = new MyThead();
        System.out.println("start");

        //4. 通过此对象调用start():
        //      <1> 启动当前线程 <2> 调用当前线程的run()
        t1.start();
        MyThead t2 = new MyThead();
        t2.start();
        System.out.println("hello");
        for  (int i = 0; i < 100; i++) {
            if(i % 2  == 0) {
                System.out.println(i + "*********main()*******");
            }
        }
    }
}


//1. 创建一个继承于Thread类的子类
class MyThead extends Thread {
    //2.重写run方法
    @Override
    public void run() {
        for  (int i = 0; i < 100; i++) {
            if(i % 2  == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}