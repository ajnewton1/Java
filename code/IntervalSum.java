// Email: ajn54@pitt.edu

import java.util.*;

public class IntervalSum {

   public static void main(String[] args) {

      // determine the minimum and maximum number in the series to sum

      Scanner stdin = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int minNumber = stdin.nextInt();

      System.out.print("Enter a larger number: ");
      int maxNumber = stdin.nextInt();
      
      System.out.println();

      // make sure user followed the instructions

      if ( maxNumber < minNumber ) {
         // the user did not follow the instructions � print message and exit

         System.out.println("Unacceptable interval: " + minNumber
             + " ... " + maxNumber + " program exits.");
         System.exit(0);
      }

      // user followed instructions sum the numbers from minNumber to maxNumber
      // in the series

     int sum = 0;           // keeps track of the running total of the
                            // terms. Nothing has been added so sum is 0 
     
           while (minNumber <= maxNumber){
         // add next term to the running total
         sum = sum + minNumber;
         // add 1 to get term of interest
         ++minNumber;}

     // running total, sum, is now the actual total

     System.out.println("The sum from is " + sum);
           }
   }



// run 1 and 4: 10
// run -4 and -1: -10
// run -3 and 3: 0
// run 5 and 5: 5
// run 8 and 6: system exit

