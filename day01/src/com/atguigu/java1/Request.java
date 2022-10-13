package com.atguigu.java1;

import java.lang.reflect.Method;

//public class Request {
//    public void send(Class clazz, Method method) throws Exception {
//        // 模拟等待响应
//        Thread.sleep(5000);
//        System.out.println("[Request]: 收到响应");
//        method.invoke(clazz.newInstance());
//    }
//}

public class Request {
    public void send(CallBack callBack) throws Exception {
        // 模拟等待响应
        Thread.sleep(5000);
        System.out.println("[Request]: 收到响应");
        callBack.processResponse();
    }
}
