package CIS122;

import java.util.Scanner;

public class Prower {
/*
Given a number x, complete the program below named Power that computes the value of xn, 
where n is an integer. While the value of the double variable x can be positive or negative, 
the value of the integer n should be non-negative.
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();
        in.close();
        System.out.print(Math.pow(x,n));
    }
}
