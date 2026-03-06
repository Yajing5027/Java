package CIS122.oop.abstractClassesAndInterfaces.Doubler;

/*
Some objects can be doubled, for example a bank account. The result would be a bank account with twice the balance. Some objects can't be doubled. For example, there is no double of a dime coin—no twenty cent coin exists.

The Doubler interface (given below) describes a callback that can compute the doubling of a given object.

Your job is to provide a class RectangleDoubler that computes the doubling of a Rectangle. The doubling should have double the width and height, but the same x and y positions of the top left corner.
*/

import java.awt.Rectangle;

public class Test {
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      RectangleDoubler doubler = new RectangleDoubler();
      
      System.out.println(doubler.makeDouble(doubler.makeDouble(box)).toString());
      System.out.println("Expected: java.awt.Rectangle[x=5,y=10,width=80,height=120]");
   }
}

