package com.atguigu.java1;

public @interface MyAnnotation {
    //成员：返回值类型 属性名
    String value() default "hello"; //使用default定义默认值
}
