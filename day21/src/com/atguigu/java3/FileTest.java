package com.atguigu.java3;

import org.junit.Test;

import java.io.File;

/**
 * File类的使用
 *
 * 1. File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2.
 *
 */
public class FileTest {

    @Test
    public void test1() {
        File file = new File("hello.txt");//相对于当前的module
        File file1 = new File("/Users/xianghaiqin/github/sgu-java/day21");
        System.out.println(file);
        System.out.println(file1);

        //构造器


    }

}
