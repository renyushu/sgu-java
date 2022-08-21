package com.atguigu.java1;

/**
 * 接口的使用
 *
 *  1. 接口使用interface来定义
 *  2. Java中，接口和类时并列的两个结构
 *  3. 如何定义接口： 定义接口中的成员
 *      3.1 jdk1以前：只能定义全局常量和抽象方法
 *          》全局常量：public static final的，但是书写时，可以省略不写
 *          》抽象方法：public abstract的
 *
 *      3.2 jdk8: 除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 *
 *   4. 接口中不能定义构造器！意味着接口不可以实例化
 *
 *
 *   5. Java开发中，使用类实现(implements)接口来使用接口
 *      如果实现类覆盖了接口中所有抽象方法，则此实现类就可以实例化
 *      如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍然为一个抽象类
 *
 *   6. Java类可以实现多个接口 ---》 弥补了Java单继承性的局限性
 *
 *
 *    7. 接口和接口之间可以多继承
 *
 *    8. 接口的具体使用，可以体现多态性
 *
 *    9. 接口实际上可以看做一种规范
 */

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flybale.MAX_SPEED);
        System.out.println(Flybale.MIN_SPEED);

        Plane p = new Plane();
        p.fly();
    }
}

interface Flybale {
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; //省略了public static final

    //抽象方法
    public abstract void fly();
    //public abstract 可以省略
    void stop();

}

class Plane implements Flybale {

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");

    }
}