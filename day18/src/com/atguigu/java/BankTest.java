package com.atguigu.java;

/**
 * 使用同步机制将单列模式中的懒汉式改写为线程安全的
 *
 */
public class BankTest {

}

class Bank {
    private Bank(){}

    private static Bank instance = null;
//    public static synchronized Bank getInstance(){
//        if(instance == null) {
//            instance = new Bank();
//            return instance;
//        }
//        return instance;
//    }

    public static Bank getInstance(){
        //方式1，线程安全的，但效率较差
        if(instance==null){
            synchronized (Bank.class) {
                if(instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
