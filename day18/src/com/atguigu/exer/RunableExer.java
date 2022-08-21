package com.atguigu.exer;


public class RunableExer {
    public static void main(String[] args) {
        MyThreadRunnable t = new MyThreadRunnable();
        Thread t1 = new Thread(t);
        t1.start();
    }
}

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        for  (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
        }
    }
}
