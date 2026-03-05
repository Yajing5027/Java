package com.oop.inheritance.This;

public class Classmate {
    String name;
    int age;

    public Classmate() {
        this("student",18);     // this()可以调用本类其他的构造方法，可以用来设置默认值
        // this()不能与super()同时使用，JVM也不会再自动加
    }
    public Classmate(String name, int age) {        // 这个例子中，this()调用了此函数
        this.name = name;
        this.age = age;
    }

}
