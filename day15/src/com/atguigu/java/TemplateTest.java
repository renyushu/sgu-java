package com.atguigu.java;

/**
 * 抽象类的应用：模板方法的设计模式
 */
public class TemplateTest {

}

abstract class Template {
    public void spendTime() {
        long start = System.currentTimeMillis();
        this.code(); // 不确定的部分、易变的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end - start));
    }

    public abstract void code();
}

class SubTempate extends Template {

    @Override
    public void code() {

    }
}