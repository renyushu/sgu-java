package com.atguigu.java;

import org.junit.Test;

/**
 * 一、异常的处理：抓抛模型
 *
 * 过程1： "抛": 程序正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象。
 *          并将此对象抛出
 *          一旦抛出对象以后，其后的代码就不再执行。
 *
 * 过程2： "抓":可以理解为异常的处理方式：
 *          1. try-catch-finally
 *          2. throws
 *
 * 二、try-catch-finally的使用
 *  try {
 *      //可能出现异常的代码
 *  } catch(异常类型1 变量名1） {
 *      //处理异常的方式1
 *  } catch((异常类型2 变量名2) {
 *       //处理异常的方式2
 *  }
 *  finally {
 *      //一定会执行的代码
 *      //可选的
 *  }
 *
 *  说明：
 *  1.finally是可选的
 *  2. 使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对一个的异常类的对象，根据此对象的类型，去catch中进行匹配
 *  3. 一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的try循环,继续执行后面得代码
 *  4. 异常顺序无要求，但是子类必须在父类上面
 *
 *
 */
public class ExceptionTest1 {
    @Test
    public void test1() {
        String str = "123";
        str = "hello";
        try {
            int num = Integer.parseInt(str); //try结构声明的变量不能在try外使用
            System.out.println("123");
        } catch (NullPointerException e) {
            System.out.println("345");
        } catch (NumberFormatException e) {
            System.out.println("出现数值转换异常.....");
            e.printStackTrace();
        }

        System.out.println("try 后面的代码....");
    }
}
