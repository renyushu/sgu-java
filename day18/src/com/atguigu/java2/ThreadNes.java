package com.atguigu.java2;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现Callable接口
 *
 *
 */

class NumThread implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++ ){
            if(i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class ThreadNes {
    public static void main(String[] args) {
        System.out.println("start");

        NumThread numThread = new NumThread();

        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
           Object sum =  futureTask.get();
           System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}


