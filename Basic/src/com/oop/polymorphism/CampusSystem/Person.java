package com.oop.polymorphism.CampusSystem;

public class Person {
    private String name;
    private String username;
    private String password;

    public Person(){    // 空参构造
    }
    public Person(String name, String username, String password){    // 全参构造
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public void work(){
        System.out.println("Everybody need work.");
    }
}
