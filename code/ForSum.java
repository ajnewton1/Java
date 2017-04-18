// Name: Aaron Newton
// Email: ajn54@pitt.edu
// Section:

import java.util.*;


public class ForSum {

   public static void main(String[] args) {

      // determine the minimum and maximum number in the series to sum

      Scanner stdin = new Scanner (System.in);

      System.out.print("Enter a number: ");
      int minNumber = stdin.nextInt();

      System.out.print("Enter a bigger number: ");
      int maxNumber = stdin.nextInt();
      System.out.println();

      // make sure user followed the instructions

      if ( maxNumber < minNumber ) {
         // the user did not follow the instructions - print message and exit

         System.out.println("Unacceptable interval: " + minNumber
             + " ... " + maxNumber + " program exits.");
         System.exit(0);
      }

      // user followed instructions sum the numbers from minNumber to maxNumber
      // in the series

     int sum = 0;           // keeps track of the running total of the
                            // terms. Nothing has been added so sum is 0 

      int currentNumber = minNumber;
	
      while (currentNumber <= maxNumber ) {
         sum = sum + currentNumber;
         ++currentNumber;
      }

     // running total is now the actual total

     System.out.println("The sum from " + minNumber
             + " to " + maxNumber + " is " + sum);
  }
}

// run prorgram with inputs 1 and 4: 
// run prorgram with inputs -4 and -1:
// run prorgram with inputs -3 and 3:
// run prorgram with inputs 5 and 5:
// run prorgram with inputs 8 and 6:

