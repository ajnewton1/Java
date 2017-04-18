
import java.util.Scanner;

//**********************************************************
//Assignemnt: Lab5
//
//Class: CS422
//
//Name: Aaron Newton
//
//Completion time:
//
//Honor Code: I pledge that this is my own work and that I 
//got help from (no one) in completing this project.
//**********************************************************

// private fields
class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;

  public Account() {
    dateCreated = new java.util.Date();
  }

  // the constructor that creates an account with the specified id and initial balance and date
  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  // the accessor and mutator method for id
  public int getId() {
    return this.id;
  }

  // the accessor and mutator method for balance
  public double getBalance() {
    return balance;
  }

  // the accessor and mutator method for annualInterestRate
  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  // the accessor and mutator method for id
  public void setId(int newId) {
    id = newId;
  }

  // the accessor and mutator method for balance
  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  // method named getMonthlyInterestRate() that returns the monthly interest rate.
  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  // method named getMonthlyInterest() that returns the monthly interest.
  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  // the accessor method for date created 
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  // method named withdraw that withdraws a specified amount from the account.
  public void withdraw(double amount) {
    balance -= amount;
  }

  // method named deposit that deposits a specified amount to the account.
  public void deposit(double amount) {
    balance += amount;
  }
}