// Name: Aaron Newton
// Email: ajn54@pitt.edu
// Section: 

import java.util.*;

public class Fraction {
   public static void main(String[] args) {

      Scanner stdin = new Scanner (System.in);

      System.out.print("Enter a positive integer: ");
      int n = stdin.nextInt();

      double fraction = 1/n;

      double total = 0;            // running sum of the fraction total

      for (int loopCounter = 0; total != 1; ++loopCounter) {
         total = total + fraction;
      }

      System.out.println("The total is " + total);
   }
}
