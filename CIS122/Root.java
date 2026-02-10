package CIS122;

import java.util.Scanner;

public class Root {
/*
Complete the following program that computes the length of a line segment with 
end points (x1, y1) and (x2, y2). According to the Pythagorean theorem, the 
length is √ [(x1 - x2)^2 + (y1 - y2)^2]. Use the Math.sqrt() method to compute 
the square root.
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        in.close();

        double result = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));       // 这里用double类型不只是因为输入也是double，而是幂运算根运算返回都是double
        System.out.println(result);
    }
}
