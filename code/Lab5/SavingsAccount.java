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

// extends account and creates privates
class SavingsAccount extends Account {
    private double balance;
    private static double annualInterestRate;
    
    // established the balance
    public SavingsAccount() {
        balance = 0;
    }
    
    // creates initialbalance
    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    // method that returns balance
    public double getBalanceSA() {
        return balance;
    }

    // method that returns annual Interest Rate
    public static double getAnnualInterestRateSA() {
        return annualInterestRate;
    }

    // method that returns balance
    public void setBalanceSA(double newBalance) {
        balance = newBalance;
    }

    // method that returns annual interest rate
    public static void setAnnualInterestRateSA(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    // method that returns the monthly interest rate
    public double getMonthlyInterestSA() {
        return balance * (annualInterestRate / 1200);
    }

    // method that withdraws if it balance is greater than 0
    public void withdrawSA(double amount) {
        if ((balance - amount) <= 0) {
            System.out.println("ERROR: Cannont overdraw account");
        }
        else if ((balance - amount) > 0) {
            balance-= amount;
        }   
    } 

    // method to deposit into the balance
    public void depositSA(double amount) {
        balance += amount;
    }
}