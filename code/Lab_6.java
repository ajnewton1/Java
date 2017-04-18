//**********************************************
// Project: Lab 6
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: approx: 2.5 hrs
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from no one in understanding and debugging my program.

//The purpose of this program is to simulate a bank. It takes a given value as 
//a balance, then calculates the interest on that balance. 
//It can also withdraw or deposit money from that very same balance.
//This program also takes user transactions, and shows them with the date they happened.

package Lab_6;

import java.util.ArrayList;
import java.util.Date;

public class Lab_6 {
   
   //driver 
   public static void main(String[] args) {
    Account account1 = new Account(1.5, 1000.00, 1122, "George");
    
    //add amount to deposit and withdraw method
    account1.deposit(30);
    account1.deposit(40);
    account1.deposit(50);
    account1.withdraw(5);
    account1.withdraw(4);
    account1.withdraw(2);

    //print statements/methods
    System.out.println("Name: " + account1.name);
    System.out.println("Monthly Interest: " + account1.getMonthlyInterestRate());
    System.out.println("Balance: " + account1.balance + "\n");
    System.out.println("Transactions------------------------------------------");
    ArrayList transactions = account1.getTransactions();
    for (int i = 0; i < transactions.size(); i++) {
			System.out.println(transactions.get(i));
    }
    }
}
//end driver

    class Account {
        
        //variables
        public String name;
        ArrayList transactions = new ArrayList();
        public int id;
        public double balance;
        private double annualInterestRate;
        public Date dateCreated = new Date();
        
    //constructor with default values            
    public Account () {
    dateCreated = new java.util.Date();
    id = 0;
    balance = 0.0;
    annualInterestRate = 0.0;
    }
    
    //constructor with specific values
    public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    }
    
    //constructor with given values
    public Account(int newId, double newBalance, double newAnnualInterestRate) {
    id = newId;
    balance = newBalance;
    annualInterestRate = newAnnualInterestRate;
    }
    
    //constructor with given values
    public Account(double newAnnualInterestRate, double newBalance, int newId, String newName) {
    annualInterestRate = newAnnualInterestRate;
    balance = newBalance;
    id = newId;
    name = newName;
    }
    
    //method to retrieve id 
    public int getId () {
      return id;
    }
    
    //method to retrieve balance
    public double getBalance() {
        return balance;
    }
    
    //method to retrieve annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    //method to create new id 
    public void newId(int newId){
        id = newId;
    }
    
    //method to create new balance
    public void newBalance(double newBalance){
        balance = newBalance;
    }
    
    //method to create new annual interest rate
    public void newAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    
    //method to give date created
    public void newDateCreated(Date newDateCreated) {
        dateCreated = newDateCreated;
    }
    
    //method to calculate then give monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    
    //method to give monthly interest
    public double getMonthlyInterest() {
     return balance*(annualInterestRate/12);   
    }
    
    //method for transactions
    public ArrayList getTransactions() {
        return transactions;
    }
    
    //method to withdraw money
    public double withdraw(double withdraw) {
        balance -= withdraw;
	Transaction transaction = new Transaction(dateCreated, 'W', balance, "withdrawal made");
	transactions.add(transaction);
	return balance;	
    }
    
    //method to deposit money
    public double deposit(double deposit) {
        balance += deposit;
	Transaction transaction = new Transaction(dateCreated, 'D', balance, "deposit made");
	transactions.add(transaction);
	return balance;
    }
} 

class Transaction {
    
    //variables
    public Date dateTransaction;
    public char type;
    public double amount;
    public double balance;
    public String description;
    public ArrayList transactions = new ArrayList();
        
    //constructor with specific date, type, balance, and description
    public Transaction(Date newDateTransaction, char newType, double newBalance, String newDescription) {
	dateTransaction = newDateTransaction;
	type = newType;
	balance = newBalance;
	description = newDescription;
	}
    
    public String toString() {	
	return dateTransaction.toString() + " " + type + " " + balance + " " + description;
	}
}