package com.atguigu.java2;

/*

main() 方法的使用说明：
    1.main方法作为程序的入口
    2.main方法是一个普通的静态方法
    3.main()方法可以作为我们与控制台交互的方式（之前：使用Scanner）
 */
public class MainTest {
    public static void main(String[] args) { //入口
        Main.main(new String[100]);

    }
}

class Main {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}