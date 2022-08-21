package com.atguigu.java1;

/***
 * 接口的使用
 *  1.体现多态性
 *  2.接口是一种规范
 *  3. 开发中，体会面向接口编程
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2. 创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3. 创建了接口的匿名实现类的非匿名对象
        USB phone = new USB(){

            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);

        //4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3结束工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){// USB usb = new Flash();
        usb.start();

        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}

interface USB{
    void start();

    void stop();
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");

    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("Printer开启工作");
    }

    @Override
    public void stop() {
        System.out.println("Printer结束工作");

    }
}