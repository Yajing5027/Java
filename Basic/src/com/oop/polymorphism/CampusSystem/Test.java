package com.oop.polymorphism.CampusSystem;

// 多态：Dad D = new son() 有继承extends/实现implements关系
// 父类引用（Person）可以指向子类对象（Student, Professor, Admin）。
// e.g. Person person = new Student("Bob", "Bob123edu", "12345678");

public class Test {
    public static void main(String[] args) {
        CampusSystemManger csm = new CampusSystemManger();
        
        Student bob = new Student("Bob","Bob123edu","12345678");
        csm.register(bob);

        Professor tom = new Professor("Tom","Tom456edu","abcdefj");
        csm.register(tom);

        Admin amy = new Admin("Amy","Amy789edu","amyamyamy");
        csm.register(amy);
    }
}
