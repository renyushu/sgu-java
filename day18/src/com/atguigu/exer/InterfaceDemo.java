package com.atguigu.exer;


interface A {
    int x = 0;
}

class B {
    int x = 1;
}

public class InterfaceDemo extends B implements A {
    public void pX() {
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        new InterfaceDemo().pX();
    }
}
