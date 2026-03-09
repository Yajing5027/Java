package com.oop.polymorphismAndAbstract;

public class Admin extends User{

    public Admin() {
    }
    public Admin(String name, String username, String password) {
        super(name, username, password);
    }
    
    @Override
    public void work(){
        System.out.println("Admin managing.");
    }

    public void auditAccount(){
        System.out.println("Audit succeeded.");
    }
}
