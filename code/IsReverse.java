// Name: Aaron Newton  
// email: ajn54@pitt.edu

import java.util.*;

public class IsReverse{

   public static void main(String[] args) {

      // prompt for and extract three numbers in nonincreasing order

      Scanner stdin = new Scanner(System.in);

      System.out.println("Enter three numbers in nonincreasing order; ");
      System.out.println("i.e., first >= second >= third.\n");

      System.out.print("First number: ");
      int value1 = stdin.nextInt();

      System.out.print("Second number: ");
      int value2 = stdin.nextInt();

      System.out.print("Third number: ");
      int value3 = stdin.nextInt();

      // make sure user followed the rules
      
      if ( ( value1 < value2) || (value2 < value3)) {
          // the user did not follow the instructions -- print message and exit
          
          System.out.println("Unacceptable values. Program exits.");
          System.exit(0);
      }

    }
}