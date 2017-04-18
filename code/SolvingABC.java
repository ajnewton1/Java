// Student name: Aaron Newton
// Email ID: ajn54@pitt.edu

import java.util.*;

public class SolvingABC {

	public static void main(String[] args) {

		// Scanner definition will go here
            Scanner stdin = new Scanner(System.in);

		// variable definitions and initializations
		int a = 3;
		int b = 12;
		int c = 6;
		int d = 1;
		
		// prompts and user input goes here
		 System.out.println ("Enter integer value for a: ");
                         a = stdin.nextInt();
                 System.out.println ("Enter integer value for b: ");
                         b = stdin.nextInt();
                 System.out.println ("Enter integer value for c: ");
                         c = stdin.nextInt();
                 System.out.println ("Enter integer value for d: ");
                         d = stdin.nextInt();
                         
		// calculate results
		double result1 = d * a;
		double result2 = c + 2 * a;
		double result3 = d - b / c;
		double result4 = c * b % c;
		double result5 = b / 2;
		
		// display the results
		System.out.println();
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println();
		
	}
}