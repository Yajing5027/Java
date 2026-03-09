package com.oop.polymorphismAndAbstract;
/*
多态：Dad D = new son() 有继承extends/实现implements关系
父类引用（User）可以指向子类对象（Student, Professor, Admin），栈stack上是父类引用User，堆heap上真正创建的是子类对象
e.g. User u = new Student();

· 编译与运行：
    · 根据就近原则父类有的子类都能调用，而且被重写过的被调用的时候还是最新版本
    · 弊端：多态new出来的对象却不能调用子类的特有方法，因为编译器根本不管本质(heap)，检查完表面伪装(stack)就直接拦截报错
        解决：绕过编译器检查 - 强制转换将栈上的父类引用类型还原成子类类型
        e.g. Student s = (Student) u;    
        · instanceof → 判断堆上的对象是否是所指定类型(=)或其子类(>)，用if (obj instanceof SubClass)可以保证强转安全
            e.g. if (u instanceof Student) {
                     Student s = (Student) u;
                 } else {
                     System.out.println("类型不匹配，无法转换");
                 }
*/

/*
抽象类不能实例化，这里的Person不能创建实例
*/

public class Test {
    public static void main(String[] args) {
        CampusSystemManger csm = new CampusSystemManger();
        
        User bob = new Student("Bob","Bob123edu","12345678");
        csm.register(bob);
        csm.task(bob);
        System.out.println("--------------------------------------------------");

        User tom = new Professor("Tom","Tom456edu","abcdefj");
        csm.register(tom);
        csm.task(tom);
        System.out.println("--------------------------------------------------");

        User amy = new Admin("Amy","Amy789edu","amyamyamy");
        csm.register(amy);
        csm.task(amy);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        User cs = new csStudent("CS","cccccccc","cscscs");
        csm.register(cs);
        csm.task(cs);   // instanceof会对Student及其子类csStudent返回true
        System.out.println("--------------------------------------------------");

        Person nobody = new User("Nobody","00000000","nonono");
        csm.register(nobody);
        csm.task(nobody);   // instanceof筛选全都不适配，返回Type Error
    }
}
