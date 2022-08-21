package com.atguigu.exer;

public class ThreadExer {
    public static void main(String[] args) {
        MyThead t1 = new MyThead();
        t1.start();
    }
}

class MyThead extends Thread {
    @Override
    public void run() {
        for  (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
        }
    }
}
