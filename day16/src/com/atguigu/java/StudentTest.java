package com.atguigu.java;

public class StudentTest {
    public static void main(String[] args) {
        try{
            Student s = new Student();
            s.regist(-1000);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}


class Student {
    private int id;

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
//            System.out.println("您输入的数据非法!!!");
            //手动抛出一个异常
//            throw new RuntimeException("您输入的数据非法");//运行时异常
            throw new Exception("您输入的数据非法"); //编译时异常, 需要做处理
        }
    }
}