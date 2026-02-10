package CIS122;

import java.util.ArrayList;

public class MultiplicationTable {

/*
Complete the program below to print out the following multiplication table:

    y | 1y | 2y | 3y | 4y | 5y 
  ----|----|----|----|----|----
    1 |  1 |  2 |  3 |  4 |  5
    2 |  2 |  4 |  6 |  8 | 10
    3 |  3 |  6 |  9 | 12 | 15
    4 |  4 |  8 | 12 | 16 | 20
    5 |  5 | 10 | 15 | 20 | 25
    6 |  6 | 12 | 18 | 24 | 30
    7 |  7 | 14 | 21 | 28 | 35
    8 |  8 | 16 | 24 | 32 | 40
    9 |  9 | 18 | 27 | 36 | 45
   10 | 10 | 20 | 30 | 40 | 50
Be careful to match the spacing as given. 
*/

    public static void main(String[] args) {
        int y = 1;
        String gap = " ";
        ArrayList<String> row1 = new ArrayList<>();
        /* ArrayList “集合”或“动态数组”
           
             创建：ArrayList<String> list = new ArrayList<>();
                - 带初始元素a、b：ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b"));
             增（add）：list.add("元素");
             删（remove）：list.remove("元素"); 或 list.remove(下标);
             改（set）：list.set(下标, "新值");
             查（get）：String v = list.get(下标);
             
             长度：list.size();
             清空：list.clear();
             判断是否包含：list.contains("元素");

           Python: list，JS: Array，Java: ArrayList（属于 List 接口）*/

        for (int i = 0; i < 6; i++){
            String prefix = i==0 ? "" : "|";
            String text = i==0 ? " y" : i + "y";
            row1.add(prefix + gap + text + gap);
        }
        // incrementing for loop 自增for循环，跟JS一样
        // Java:        for (int i = 0; i < 6; i++) {}
        // JavaScript:  for (let i = 0; i < 6; i++) {}
        // Python:      for i in range(6):
        // tip:若自增变量提前声明，for 循环里仍要保留“;”，详见下方第二个循环

        System.out.println(String.join("", row1));
        // String join method 字符串连接方法，跟Python类似
        // Python:  "".join(list)
        // Java:    String.join("", list)

        System.out.println("----|----|----|----|----|----");

        for (; y < 11; y++){
            ArrayList<String> row3 = new ArrayList<>();
            for (int i = 0; i < 6; i++){
                int value = i==0 ? y : y * i;
                String prefix = i==0 ? "" : "|";
                String text =  value<10 ? (prefix + gap + ' ' + value + gap) : (prefix + gap + value + gap);
                row3.add(text);
            }
            System.out.println(String.join("",row3));
        }
    }
}
