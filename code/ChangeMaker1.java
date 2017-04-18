//*
// Account: ajn54@pitt.edu
// Author: Aaron Newton
// Completion Time: 
// Honor Code: I pledge that this program represents my own program.
// I recieved help from no one in understanding and debugging my program.


package changemaker1;

import java.util.Scanner;

public class ChangeMaker1 {
    public static void main(String[] args) {  
        // TODO code application logic here
        // make a Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter amount paid: ");
        System.out.println("Enter amount owed: ");
        double amountPaid = input.nextDouble();
        double amountOwed = input.nextDouble();
        double amount = amountPaid - amountOwed;
       
        
        // convert into cents
        int remainingAmount = (int)(amount * 100);
        
        
        // find # of dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        // find # of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        // find # of Dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // find # of Nickles
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        // find # of pennies is the remaining amount
        int numberOfPennies = remainingAmount;
        
        // show results
        System.out.println("Your amount $" + amount + " includes" );
        System.out.println("   " + numberOfDollars + " dollars");
        System.out.println("   " + numberOfQuarters + " quarters");
        System.out.println("   " + numberOfDimes + " dimes");
        System.out.println("   " + numberOfNickels + " nickels");
        System.out.println("   " + numberOfPennies + " pennies");
                
                
        
    
        
        
    }
    
}
