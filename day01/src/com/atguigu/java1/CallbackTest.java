package com.atguigu.java1;

import java.lang.reflect.Method;

public class CallbackTest {
    public static void main(String[] args) throws Exception {
        Request request = new Request();
        System.out.println("[main]: 我开个县城去异步发请求");
//        CallBack callBack = new CallBack();
        CallBack callBack = new CallBackImpl();
        new Thread(() -> {
            try {
                request.send(callBack);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("[main]: 请求发完了，我去干点别的...");
        Thread.sleep(10000);
    }
}

