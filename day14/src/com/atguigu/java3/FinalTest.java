package com.atguigu.java3;

/**
 * final: 最终的
 * 1. final 可以用来修饰的结构： 类、方法、变量
 *
 * 2. final用来修饰的类：不能被其他类继承
 *
 * 3.final用来修饰方法：此方法不能被重写
 *
 * 4. final用来修饰变量，此时的变量就成为一个常量
 *      4.1 final修饰属性：可以考虑赋值的位置有： 显示初始化、代码块中初始化、构造器中初始化
 *      4.2 final修饰局部变量
 *          尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋值一个是实参。
 *          一旦赋值以后，就只能在方法体内使用此形参，但不能再次赋值。
 *
 *
 * static final用来修饰属性：全局常量
 */
public class FinalTest {
    public static void main(String[] args) {

    }
}

//final修饰的类不能被继承
final class FinalA {

}

class AA {
    public final void show() {

    }
}

class BB extends AA {
//    public void show() {
//
//    }
}