package com.atguigu.java;

/**
 *  e.g: 创个三个窗口卖票，总票数为100张；使用实现Runnable接口的方法
 *
 * 创建多线程的方式二： 实现Runnable接口
 *  1. 创建一个实现了Runnable接口的类
 *  2. 创建一个实现了Runnable中的抽象方法：run()
 *  3. 创建实现类的对象
 *  4. 将此对象作为参数传递到Thread类的构造中，创建Thread类的对象
 *  5. 通过Thread类的对对象调用start()
 *
 * 比较线程的两种方式：
 * 开发中，优先选择：实现runnable接口的方式
 *  原因：1.实现的方式没有类的单继承性的局限性
 *       2. 实现的方式更适合来处理多个现成的有共享数据的情况
 *
 * 联系：Thread类本身也实现了Runnable接口， public class Thread implements Runnable
 * 相同点：两种方式都需要重写run() ,将线程要执行的逻辑声明在run()中。
 *
 *
 *  在java中，我们通过同步机制，来解决线程的安全问题
 *
 *  方式1： 同步代码块
 *      synchronized(同步监视器){
 *          //需要被同步的代码
 *      }
 *      说明：操作共享数据的代码，即为需要被同步的代码
 *          共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
 *
 *          同步监视器：就是锁。任何一个类都可以充当锁.
 *              要求：多个现成必须要共享同一个把锁
 *
 *
 *  方式2： 同步方法
 *
 *
 */
class Window3 implements Runnable {
    private int ticket = 100;
     @Override
    public void run() {
        while (true) {
            show();
        }
    }
    private void show() {
        synchronized(this) {
            if(ticket > 0) {
                System.out.println(Thread.currentThread().getName()  + ": 卖票, 票号为: "  + ticket);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
            }
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}