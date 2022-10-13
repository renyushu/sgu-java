package com.atguigu.java1;

abstract class Person {
    private String title;
    public Person(String title) {
        this.title = title;
    }
    abstract public void eat();
    public static PersonImpl getInstance(String title) {
        return new PersonImpl(title);
    }
    static class PersonImpl extends Person {
        public PersonImpl(String title) {
            super(title);
        }

        @Override
        public void eat() {
            System.out.println("EAT！！！");
        }
    }
}
