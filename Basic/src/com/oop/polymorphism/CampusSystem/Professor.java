package com.oop.polymorphism.CampusSystem;

public class Professor extends User{

    public Professor() {
    }
    public Professor(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work(){
        System.out.println("Professor teaching.");
    }

    public void publishHomework(){
        System.out.println("Publish succeeded");
    }
}
