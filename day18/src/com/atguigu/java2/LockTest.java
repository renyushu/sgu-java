package com.atguigu.java2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三： Lock锁
 *
 *
 */

class Window implements Runnable{
    private int ticket = 100;
    //1.实例化lock
    private ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while(true) {
            try{
                //2.调用lock()
                lock.lock();
                if(ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ": 售票，票号为" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally {
                //3.调用解锁方法：unlock()
                lock.unlock();
            }

        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();

    }
}
