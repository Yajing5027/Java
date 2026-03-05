package com.oop.inheritance.Override;

public class Phone extends SmartDevice{
    public Phone() {        // 构造函数无法被继承，子类中仍然需要显式定义
        // super()
        // JVM在这里默认添加super隐式调用父类空参构造函数，运行时先执行父类构造，再执行子类构造
    }
    public Phone(String name, double price) {
        super(name, price);     // super显式调用父类全参构造函数
    }

    @Override
    public double payment() {
        return super.payment() * 0.9;
    }
    
}
