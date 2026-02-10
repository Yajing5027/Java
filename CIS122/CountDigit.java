package CIS122;

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

        // 运行附加题
        checkDivisibleBy3(in);

        in.close();
    }

/*
Whether the number is divisible by 3？

    数学原理：基于同余定理（modulo m）。
    - 对于任意模数 m，如果满足 10 ≡ 1 (mod m)，则对于任意非负整数 k 有 10^k ≡ 1 (mod m)，
        因此任意整数与其各位数字之和在 mod m 下同余（即原数 ≡ 各位之和 (mod m)）。
    - 换言之：该“各位和判定”在模 m 下成立的充要条件是 10 ≡ 1 (mod m)。
    - 进一步可以证明 10 ≡ 1 (mod m) 等价于 m | 9（m 是 9 的约数），因此规则对能整除 9 的模数成立（例如 m=9）。
    - 对于其他模数（例如 2、5、7），10 在 mod m 下不等于 1，所以“各位和”不能通用地判断是否能被该 m 整除。
*/
   
    public static void checkDivisibleBy3(Scanner in) {
        System.out.print("输入一个整数: ");
        int num = in.nextInt();

        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;  // 取出最后一位加到sum
            temp /= 10;        // 去掉最后一位
        }

        boolean isDivisible = (sum % 3 == 0);
        System.out.println("各位数字之和: " + sum);
        System.out.println(num + " 能被3整除: " + isDivisible);
    }
}
