package com.atguigu.java;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法的重写的规则之一：
 *  子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *
 */
public class OverrideTest {

}

class SuperClass {
    public void method() throws IOException {

    }
}

class SubClass extends SuperClass {
    public void method() throws FileNotFoundException {

    }
}

