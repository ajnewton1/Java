//****************************************
// Project: Lab 3
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 1.5 hours
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from no one in designing and debugging my program.
//******************************************

// driver 

public class Lab_3 {
    
    public static void main(String[] args) {
        
        // Legend
        System.out.println("                                  Legend");
        System.out.println("    This program creates account ID 1122, a balance of $1,000, and an");
        System.out.println("  annual interest rate of 1.5%. It also withdraws $2,500 from the account");
        System.out.println("    and then deposits $3,000 to the account. Finally, the program prints");
        System.out.println("the balance, the monthly interest, and the date when this account was created.");
        
        // call the methods
        account1 account = new account1(1122, 1000.0, 1.5, "George");
               
        // print 
        System.out.println("\nAccount Summary-------------------------------------");
        System.out.println("Name: " + account.getname());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterest());
        System.out.println("Balance: " + account.getbalance());
        System.out.println("\nTransactions----------------------------------------");
        System.out.println("Balance: " + account.getbalance());
        System.out.println("Balance: " + account.getbalance());
        System.out.println("Account was created on " + account.setdateCreated());
        System.out.println(account.withdraw());
    }
}