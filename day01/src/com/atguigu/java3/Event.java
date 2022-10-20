package com.atguigu.java3;

/**
 * 事件对象Event
 *
 * 事件对象分封装了事件源
 *
 * 在监听器上能能够通过事件对象获取得到事件源
 *
 */
public class Event {
    private Person person;

    public Event() {

    }

    public Event(Person person) {
        this.person = person;
    }

    public Person getResource() {
        return person;
    }
}
