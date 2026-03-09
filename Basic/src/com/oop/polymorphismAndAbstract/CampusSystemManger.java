package com.oop.polymorphismAndAbstract;

public class CampusSystemManger {

    public void register(Person person){    // 适配重写后父类共同方法
        System.out.println("User " + person.getName() + " registration succeeded. Please save your information: username - " + person.getUsername() + ", password - " + person.getPassword());
        person.work();
    }

    public void task(Person person){        // 适配各子类自方法
        if (person instanceof Student){     // 这里instanceof会对Student及其子类csStudent返回true
            Student s = (Student) person;
            s.submitHomework();
        }else if (person instanceof Professor){
            Professor p = (Professor) person;
            p.publishHomework();
        }else if (person instanceof Admin){
            Admin a = (Admin) person;
            a.auditAccount();
        }else{
            System.out.println("Type Error.");
        }
    }
}
