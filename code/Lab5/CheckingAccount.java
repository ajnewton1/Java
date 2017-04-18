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

// extends account and create privates
class CheckingAccount extends Account {
    private int overdraft = -1000;
    private int fee = 25;
    private double balance;
    
    public CheckingAccount(double newBalance){
        balance = newBalance;
    }
    
    // method that returns balance
    public double getBalanceCA() {
        return balance;
    }

    // creates a new balancs
    public void setBalanceCA(double newBalance) {
        balance = newBalance;
    }

    // method that withdraws the specified amount
    public void withdrawCA(double amount) {
        balance -= amount;
    }

    // method that deposits the specified amount
    public void depositCA(double amount) {
        balance += amount;
    }
    
    // method that determines the overdraftlimit
    public double overdraftLimit() {
        if ( balance <= overdraft) {
            balance -= fee;
            System.out.println("OVERDRAFT");
            System.out.println("$25 fee will be added");
            System.out.print("Current Balance: $");
        }   
        else if ( balance > overdraft) {
            System.out.print("Current Balance: $");
        }      
        return balance;
    } 
}