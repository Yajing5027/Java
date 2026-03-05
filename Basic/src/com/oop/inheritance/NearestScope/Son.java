package com.oop.inheritance.NearestScope;
/* 
单继承
Object - 顶级父类
作用域就近原则
*/

public class Son extends Dad{
    String name = "Son";
    String food = "chocolate";


    public void testScope() {
        String name = "test";

        System.out.println(name);           //方法内出现第一个name
        System.out.println(this.name);      //子类作用域
        System.out.println(super.name);     //父类作用域 (最多到爸爸，爷爷找不来)

        System.out.println(food);           //子类出现第一个food
        System.out.println(this.food);
    
        System.out.println(address);        //父类出现第一个address
        System.out.println(this.address);
        System.out.println(super.address);
        
    }

    public static void main(String[] args) {
        Son a = new Son();
        a.testScope();
    }
}
