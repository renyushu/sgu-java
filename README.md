# sgu-java
### day01
 - 回调
### day15
- 抽象类 java
```java
/**
 * abstract关键字的使用
 *  1. abstract：抽象的
 *  2. abstract可以用来修饰的结构：类、方法
 *
 *  3. abstract修饰类：抽象类
 *      》此类不能实例化
 *      》抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程)
 *      》开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 *  4. abstract修饰方法：抽象方法
 *      》抽象方法只有方法的声明，没有方法体
 *      》包含抽象方法的类一定是抽象类
 *      》若子类重写了父类中的所有抽象方法方可实例化，若子类没有重写父类中所有的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰一下
 *
 *
 *
 */


```
- 接口 java1
```java
/**
 * 接口的使用
 *
 *  1. 接口使用interface来定义
 *
 *  2. Java中，接口和类时并列的两个结构
 *
 *  3. 如何定义接口： 定义接口中的成员
 *      3.1 jdk1以前：只能定义全局常量和抽象方法
 *          》全局常量：public static final的，但是书写时，可以省略不写
 *          》抽象方法：public abstract的
 *
 *      3.2 jdk8: 除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 *
 *   4. 接口中不能定义构造器！意味着接口不可以实例化
 *
 *
 *   5. Java开发中，使用类实现(implements)接口来使用接口
 *      如果实现类覆盖了接口中所有抽象方法，则此实现类就可以实例化
 *      如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍然为一个抽象类
 *
 *   6. Java类可以实现多个接口 ---》 弥补了Java单继承性的局限性
 *      格式：class AA extends BB implements CC, DD, EE
 *
 *
 *    7. 接口和接口之间可以多继承
 *
 *
 *    8. 接口的具体使用，可以体现多态性
 *
 *    9. 接口实际上可以看做一种规范
 */ 
```
### day18
- 多线程

### day20
- 集合


### day22
- 反射
- 动态代理