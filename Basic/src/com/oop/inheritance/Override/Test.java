package com.oop.inheritance.Override;
/*
子类能调用不代表子类继承了  e.g.构造函数无法被继承，子类中仍然需要显式定义，但是子类可以通过super()关键词调用

重写：子类方法申明（方法名+形参)必须与父类一致
1.父类方法体都不需要 -- 直接删掉抛弃全部方法体重写
2.父类方法体的延申 -- 直接对用super调出的结果进行操作

· 子类访问权限不大于父类（空 < protected < public）
· 子类返回类型不小于父类

· 不可被重写：static静态方法、private私有方法、final最终类
*/
public class Test {
    public static void main(String[] args) {
        Phone iphone = new Phone("iPhone",7999);
        Pad ipad = new Pad("iPad",9000);
        Laptop myLaptop = new Laptop("Laptop",10000);
    
        System.out.println(iphone.payment());
        System.out.println(ipad.payment());
        System.out.println(myLaptop.payment());
    }
}
