// Student name:   Aaron Newton
// Email ID:  ajn54@pitt.edu

import static java.lang.Math.log10;
import java.util.*;

public class MathFun {

	public static void main(String[] args) {
		// set up the Scanner object

		Scanner stdin = new Scanner(System.in);
		
		// have the user input the values for x and y
               
		System.out.print("Enter a decimal number: ");
		double x = stdin.nextDouble();

		System.out.print("Enter another decimal number: ");
		double y = stdin.nextDouble();

		// compute the 6 desired mathematical calculations *****

		double squareRootX = Math.sqrt(x);
		
		// YOUR MODIFICATIONS TO THE CODE GO BELOW      ***********
		// CHANGE THE O's TO THE RIGHT MATH INVOCATION  ***********

		double logY = Math.log10(y);

		double expX  = Math.exp(x);

		double minXY = Math.min(x,y);

		double maxXY = Math.max(x,y);
		
		double xPowerY = Math.pow(x,y);

		// display the results

		System.out.println();
		System.out.println ("Square root of " + x + " is " + squareRootX);
		System.out.println ("Log base 10 of " + y + " is " + logY);
		System.out.println ("e to the power " + x + " is " + expX);
		System.out.println ("The min of " + x + " and " + y + " is " + minXY);
		System.out.println ("The max of " + x + " and " + y + " is " + maxXY);
		System.out.println (x + " to the power " + y + " is " + xPowerY);
 		System.out.println();
     
	}
}