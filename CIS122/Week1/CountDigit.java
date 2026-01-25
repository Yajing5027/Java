package CIS122.Week1;

import java.util.Scanner;

public class CountDigit {
/*
Complete the program below named CountSevens so that it reads in an integer value, 
counts the number of digits in that number that have the value 7, and prints out 
the final count. For example, the integer value, 57687728, would have 3 digits with 
the value 7.
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();

        // 方法1: int转字符串
        String y = x + "";      // int转字符串常用写法：x + "" 或 String.valueOf(x)

        int count1 = 0;

        for (int i = 0; i < y.length();i++){        // 字符串用length()方法 s.length()，数组用length属性 arr.length
            int judge = y.charAt(i)=='7' ? 1 : 0;       // 查字符串: s.charAt(索引)，注意返回的是char类型
            count1 += judge;
        }
        System.out.println(count1);

        // 方法2: modulus operation 取模运算/取余运算
        int count2 = 0;
        while (x>0){
            int judge = x%10==7 ? 1 : 0;        // x 对 10 取余运算可取出最后一位数
            x /= 10;
            count2 += judge;
        }
        System.out.println(count2);
    }
}
