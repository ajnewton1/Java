//****************************************
// Project: Lab 6
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 1.5 hours
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from no one in designing and debugging my program.
//******************************************

import java.util.*;

public class account1 {
    
    // create the private data fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private String name;
    private Date dateCreated = new Date();
    private ArrayList<Integer> transaction = new ArrayList<Integer>();
    
    // the no-arg constructor that creates a default account
    public account1 () {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        name = "";
    }
    
    // the constructor that creates an account with the specified id and initial balance
    public account1 (int newid, double newbalance, double newannualInterestRate, String newname) {
        id = newid;
        balance = newbalance;
        annualInterestRate = newannualInterestRate;
        name = newname;
    }

    // the accessor and mutator method for name
    public String getname() {
        return name;
    }

    // the accessor and mutator method for id
    public int getid() {
        return id;
    }
    
    // the accessor and mutator method for balance
    public double getbalance() {
        return balance;
    }
    
    // the accessor and mutator method for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    // the accessor method for date created 
    public Date setdateCreated() {
        return dateCreated;
    }
    
    // method named getMonthlyInterestRate() that returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }
    
    // method named getMonthlyInterest() that returns the monthly interest.
    public double getMonthlyInterest() {
        return balance*(annualInterestRate/12);
    }
    
    // method named withdraw that withdraws a specified amount from the account.
    public double withdraw() {
        transaction.add(30);
        transaction.add(40);
        transaction.add(50);
        for(Integer number : transaction) {
            System.out.println("Withdraws: " + number);
        }
        return balance;
    }
    
    // method named deposit that deposits a specified amount to the account.
    public double deposit(double amount) {
        return balance = balance + amount;
    }
    
    public ArrayList Transaction() {
        return transaction;
    }
}