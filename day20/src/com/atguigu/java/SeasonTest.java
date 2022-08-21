package com.atguigu.java;

/***
 * 一、枚举类的使用
 * 1. 枚举类的理解：类的对象只要有限个，确定的，我们称为枚举类。
 * 2. 当需要定义一组常量时，强烈建议使用枚举类
 * 3. 如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 *
 */

public class SeasonTest {
    public static void main(String[] args) {

    }
}

//自定义枚举类
class Season{
    //1.声明Season对象的属性 private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象
    public static final Season SPRING = new Season("春天", "Spring");
    public static final Season SUMMER = new Season("夏天", "Summer");
    public static final Season AUTUMN = new Season("秋天", "Autumn");
    public static final Season WINTER = new Season("冬天", "Winter");

    //4.获取枚举类对象的其他属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //其他诉求
    @Override
    public String toString() {
        return seasonName;
    }
}