// Aaron Newton
// ajn54@pitt.edu
import java.util.*;

public class Nand {
   public static void main(String[] args) {

      // Prompt user and read input values for p and q

      Scanner stdin = new Scanner(System.in);

      System.out.print("Please enter a logical value (true, false): ");
      boolean p = stdin.nextBoolean();

      System.out.print("Please enter another logical value (true, false): ");
      boolean q = stdin.nextBoolean();

      // compute the correct value to assign to nand using if-else-if's

      boolean nand;
      if ( (p) && (q) ) {
         nand = false;
      }
      else {  // (p) and (q)
         nand = true;
      }
      // display nand's value

      System.out.println( p + " nand " + q + " = " + nand);
   }
}