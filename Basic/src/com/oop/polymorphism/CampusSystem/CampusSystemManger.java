package com.oop.polymorphism.CampusSystem;
public class CampusSystemManger {
    public void register(Person person){    // 参数在这里放进去
        System.out.println("User " + person.getName() + " registration succeeded. Please save your information: username - " + person.getUsername() + ", password - " + person.getPassword());
        person.work();      // 多态
    }
}
