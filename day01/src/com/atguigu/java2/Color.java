package com.atguigu.java2;

/**
 * 1）使用enum定义的枚举类默认继承了java.lang.Enum，实现了java.lang.Comparable接口，且不能继承其他类，也不可以被继承。但枚举类可以实现一个或多个接口。想深入学习必须挖Enum的源码。
 * 2）枚举类的所有实例必须放在第一行显示，不需使用new，不需显示调用构造方法，每个变量都是public static final修饰的，最终以分号结束。在之后的反编译中，我们就可以理解枚举类其实也是颗语法糖。
 * 3）枚举类的构造方法是私有的，默认的就是private，定义的时候不加也没事。
 * 4）switch()参数可以使用enum。这个在后文有详细代码。
 * 5）非抽象枚举类默认是final的但定义的时候加上final却编译不通过。我们通过后续的反编译可以得到验证。
 * 6）枚举类可以有抽象方法，但是必须在它的实例中实现。后续也会验证这一条。
 */

public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4), BACK("黑色", 5);

    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //覆盖方法
    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }
}
