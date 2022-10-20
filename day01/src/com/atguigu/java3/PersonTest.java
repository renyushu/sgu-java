package com.atguigu.java3;

/**
 * 监听器就是一个实现特定接口的普通java程序，这个程序专门用于监听另一个java对象的方法调用或属性改变，
 * 当被监听对象发生上述事件后，监听器某个方法将立即被执行。。
 */

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.registerLister(new PersonListener() {
            // 监听器方法
            @Override
            public void doEat(Event event) {
                Person person1 = event.getResource();
                System.out.println(person1 + "正在吃饭呢!");
            }

            @Override
            public void doSleep(Event event) {
                Person person1 = event.getResource();
                System.out.println(person1 + "正在睡觉呢!");
            }
        });

        //当调用eat方法时，触发事件，将事件对象传递给监视器，最后监听器获取事件源，对事件源进行操作
        person.Eat();
        person.sleep();
    }
}
