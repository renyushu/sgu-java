package com.atguigu.java2;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Season.Summer);
    }
}

class Season {
    //枚举类的所有实例必须在枚举类中显示列出，列出的会自动添加 public static final修饰
    public static final Season SPRING = new Season("春天", "春乱花开");
    public static final Season Summer = new Season("夏天", "夏日炎炎");

    private final String SEASONNAME;
    private final String SEASONDESC;

    // 枚举类的构造器只能使用private修饰
    private Season(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }
}