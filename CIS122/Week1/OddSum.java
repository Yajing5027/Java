package CIS122.Week1;

import java.util.Scanner;

public class OddSum {

/* 
Complete the OddSum class below, which should add up all the odd integers between two 
integer bounds. As an example, given the two input bounds 3 and 8, the program should 
compute 3 + 5 + 7 = 15, and print the value 15. 
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int sum = 0;

        for (;a<=b;a++){
            if (a>0){
                int judge = a%2==1 ? a : 0;
                sum += judge; 
            }else{
                int judge = a%2==-1 ? a : 0;
                sum += judge; 
            }
        }
        System.out.println(sum);
    }
}
