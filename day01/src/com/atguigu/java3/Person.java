package com.atguigu.java3;

import java.awt.*;

/**
 * 事件源Person
 *
 * 事件源要提供方法注册监听器（即在事件源上关联监听器对象)
 *
 */
public class Person {
    //在成员变量定义一个监听器对象
    private PersonListener personListener;

    //对象方法
    //在事件源中定义两个方法
    public void Eat() {
        // 当事件源调用了Eat方法时，应该触发监听器的方法，调用监听器的方法并把事件对象传递进去
        System.out.println("吃饭....");
        personListener.doEat(new Event(this));
    }

    public void sleep() {
        //当事件源调用了Eat方法时，应该触发监听器的方法，调用监听器的方法并把事件对象传递进去
        System.out.println("睡觉....");
        personListener.doSleep(new Event(this));
    }

    //注册监听器，该类没有监听器对象啊，那么就传递进来吧
    public void registerLister(PersonListener personListener) {
        this.personListener = personListener;
    }
}
