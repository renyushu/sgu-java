package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 调用运行时类中指定的结构：属性、方法、构造器
 *
 */
public class ReflectionTest {
    @Test
    public void testField() throws Exception {
        Class clazz = Person.class;
//        System.out.println();
        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();

        // 获取指定的属性
        Field id = clazz.getField("id");

        //设置当前属性的值
        id.set(p, 1000);

        //获取当前属性的值
        int pid = (int) id.get(p);
        System.out.println(pid);



    }

    /**
     * 如何操作运行类中指定的属性 -- 需要掌握
     * @throws Exception
     */
    @Test
    public void testField1() throws Exception {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();

        //getDeclaredField: 获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");
        //2.保证当前属性是可访问的
        name.setAccessible(true);
        name.set(p, "Tom");

        System.out.println(name.get(p));
    }

    /**
     * 如何操作运行类中指定的方法 -- 需要掌握
     */
    @Test
    public void testMethod() throws Exception {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();

        //获取指定类的某个方法
        //getDeclaredMethod: 1.指明获取的方法的名称 2.指明获取的方法的形参列表
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        //调用方法
        //invoke的返回值即为对应类中调用方法的返回值
        Object ojb = show.invoke(p, "US");
        System.out.println(ojb);

        //如何调用静态方法
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object returnValue = showDesc.invoke(Person.class);
        System.out.println(returnValue);

    }

    /**
     * 如何操作运行类中指定的构造器
     */
    @Test
    public void testConstructor() throws Exception {
        Class clazz = Person.class;

        // private Person(String name)
        //1.获取指定的构造器
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        //保证此构造器是可访问的
        declaredConstructor.setAccessible(true);
        
        //3.调用此构造器创建运行时类的对象
        Person tom = (Person) declaredConstructor.newInstance("Tom");
        System.out.println(tom);

    }


}
