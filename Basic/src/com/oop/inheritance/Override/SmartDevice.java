package com.oop.inheritance.Override;

public class SmartDevice {
    String name;
    double price;

    public SmartDevice() {      // 空参构造函数
    }
    public SmartDevice(String name, double price) {     // 全参构造函数
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double payment(){
        if (0<=price && price<1000){
            return price;
        }else if(1000<=price && price<5000){
            return price*0.9;
        }else if(5000<=price && price<10000){
            return price*0.8;
        }else if(10000<=price){
            return price*0.7;
        }
        return 0;       // 如果任何条件都不符合也必须得有返回值
    }

    
}
