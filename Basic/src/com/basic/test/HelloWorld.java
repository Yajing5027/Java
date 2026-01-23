package com.basic.test;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {    // psvm
        System.out.println("Hello, World!");                 // sout

        Scanner sc = new Scanner(System.in);  // 创建 Scanner 对象以读取输入

        sc.close(); // 结束时关闭（可选，某些环境下关闭 System.in 会影响后续读取）    
    }
}
