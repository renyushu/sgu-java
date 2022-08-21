package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

public class DAOTest {
    @Test
    public void test1() {
        CustomerDao dao1 = new CustomerDao();
        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);
    }
}
