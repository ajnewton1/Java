// Name: Aaron Newton
// Email: ajn54@pitt.edu

import java.util.*;

public class Predict {
	
   public static void main(String[] args){
      Scanner stdin = new Scanner(System.in);

      System.out.print("Enter a logical value (true or false):");
      boolean p = stdin.nextBoolean();

      System.out.print("Enter a logical value (true or false):");
      boolean q = stdin.nextBoolean();

      System.out.print("Enter a logical value (true or false):");
      boolean r = stdin.nextBoolean();

      System.out.println();

      if (p && q) {
         if (r) {
            System.out.println("1");
            // if all are true then print 1
         }
         else {
            System.out.println("2");
            // if all else other than r is true print 2
         }
      }
      else if (q && r) {
            System.out.println("3");
            // if all is true other than p, print 3
         }
         else {
            if (p || !r) {
               System.out.println("4");
               // if p is true, or if r is false then print 4 
            }
            else {
               System.out.println("5");
               // in order to print 5, value 3 is false
            }
         }

   }
}
