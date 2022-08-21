package com.atguigu.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程的方式4: 使用线程池
 */

class NumberThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" +  i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" +  i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(new NumberThread());//适用于Runnable
        service.execute(new NumberThread1());//适用于Runnable

//        service.submit();//适用于Callable
        service.shutdown();
    }
}
