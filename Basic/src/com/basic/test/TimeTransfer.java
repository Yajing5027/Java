package com.basic.test;

import java.util.Scanner;

public class TimeTransfer {
    // 注意：之前补零时用了字符'0'，导致输出 ASCII 码值48，一定是用字符串"0"拼接后才会是字符串，字符会转换码值
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int second = in.nextInt();
        in.close();

        if (0 <= second && second <= 100000000){    // Java不能写 <=second<= ，必须拆成两个条件用&&连接
            int hourInt = second / 3600;
            String hour = hourInt < 10 ? "0" + hourInt : String.valueOf(hourInt);
            second %= 3600;

            int minInt = second / 60;
            String min = minInt < 10 ? "0" + minInt : String.valueOf(minInt);

            second %= 60;
            String sec = second < 10 ? "0" + second : String.valueOf(second);

            System.out.print(hour + "H " + min + "m " + sec + "s");
        }else{
            System.out.println("Invalid");
        }
    }
}
