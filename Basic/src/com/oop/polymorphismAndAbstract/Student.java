package com.oop.polymorphismAndAbstract;

public class Student extends User{
    public Student() {
    }
    public Student(String name, String username, String password) {
        super(name, username, password);
    }
    
    @Override
    public void work(){
        System.out.println("Student learning.");
    }

    public void submitHomework(){
        System.out.println("Submit succeeded.");
    }
}
