package com.atguigu.java1;

import java.util.List;

/**
 *DAO: data(base) access object
 *
 *
 */

//操作数据库最基本的类，不确定操作哪一张表，所以需要使用泛型
public class DAO<T> {//操作表的共性操作

    //添加一条记录
    public void add(T t) {

    }

    //删除一条记录
    public boolean remove(int index) {
        return false;
    }
    //修改
    public void update(int index, T t) {

    }

    //查询
    public T getIndex(int id) {
        return null;
    }
    //查询多条
    public List<T> getForList(int index) {
        return null;
    }

    //泛型方法
    //
    public <E> E getVaule() {
        return null;
    }
}
