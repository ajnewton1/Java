// Name: Aaron Newton
// Email: ajn54@pitt.edu

import java.util.*;

public class IsTriangle {

   public static void main(String[] args) {

      // prompt for and extract three positive numbers in nondecreasing order

      Scanner stdin = new Scanner(System.in);

      System.out.println("Enter three numbers in nondecreasing order; ");
      System.out.println("i.e., first >= second >= third.\n");

      System.out.print("First number: ");
      int value1 = stdin.nextInt();

      System.out.print("Second number: ");
      int value2 = stdin.nextInt();

      System.out.print("Third number: ");
      int value3 = stdin.nextInt();

      // make sure user followed the rules

      if ( (value1 < value2) && (value2 > value3) || (value1 <= 0) ) {
         // the user did not follow the instructions - print message and exit

         System.out.println("Unacceptable values. Program quits.");
         System.exit(0);
      }

      // user followed the instructions, now test whether inputs form
      // triangle sides 

      if ( (value1 + value2) <= value3 ) {
         // lengths do not form a triangle

         System.out.println("Lengths do not represent triangle sides.");
      }

           else {
         // lengths form a triangle

                System.out.println("Lengths can represent triangle sides.");
          
        // if values are 4,5,8 the program will print out "Lengths can represent triangle sides."
      }
   }
}