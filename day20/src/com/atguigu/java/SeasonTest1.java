package com.atguigu.java;

/**
 * 使用enum定义的枚举类默认继承 java.lang.Enum
 *
 * 常用方法：
 *  values()
 *  toString
 *
 */
public class SeasonTest1 {
    public static void main(String[] args) {
//        Season1 s = Season1.SPRING;
//        System.out.println(s);
//
//        Season1[] values = Season1.values();
//        for(int i = 0; i < values.length; i++){
//            System.out.println(values[i]);
//        }

        //valueOf
        Season1 winter = Season1.valueOf("WINTER");
//        System.out.println(winter);
        winter.show();
    }
}

interface Info{
    void show();

}

//使用enum关键字枚举类
enum Season1 implements Info{
    //1.提供当前枚举类的对象，多个对象之间用","隔开,末尾用";"结束
    SPRING("春天", "Spring"){
        @Override
        public void show() {
            System.out.println("春天在哪里...");
        }
    },
    SUMMER("夏天", "Summer"),
    AUTUMN("秋天", "Autumn"),
    WINTER("冬天", "Winter"){
        @Override
        public void show() {
            System.out.println("冬天在哪里...");

        }
    };

    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

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

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}