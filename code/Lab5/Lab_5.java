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

public class Lab_5 {
    
  public static void main (String[] args) {
      
    // Legend
    System.out.println("                         Legend");
    System.out.println("   This program runs just like a bank. It creates an");
    System.out.println("     Account, CheckingAccount, and a SavingsAccount.");
    System.out.println(" The CheckingAccount cannot be more than $1000 in debt or");
    System.out.println("   there will be a $25 fee added and the SavingsAccount");
    System.out.println("                  cannont be overdrawn.");
    System.out.println("");
    
    //print and declare methods
    Account account = new Account(1122, 20000);
    Account.setAnnualInterestRate(4.5);
    System.out.println("Account-------------------------------------------------");
    System.out.println("This account was created on " +account.getDateCreated());
    System.out.println("Current Balance: $" +account.getBalance());
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Withdrawal: $2,500.0 ");
    System.out.println("Deposit: $3,000.0");
    System.out.println("Current Balance: $" +account.getBalance());
    System.out.println("Monthly interest: $" +
    account.getMonthlyInterest());
    CheckingAccount ca = new CheckingAccount(10000);
    System.out.println("CheckingAccount-----------------------------------------");
    System.out.println("This CheckingAccount was created on " +account.getDateCreated());
    System.out.println("Current Balance: $"+ca.getBalanceCA());
    ca.depositCA(6500);
    System.out.println("Deposit: $6500.0");
    ca.withdrawCA(11000);
    System.out.println("Withdrawl: $11000.0");
    System.out.println(ca.overdraftLimit());
    ca.depositCA(500);
    System.out.println("Deposit: $500.0");
    ca.withdrawCA(7000);
    System.out.println("Withdrawal: $7000.0");
    System.out.println(ca.overdraftLimit());
    SavingsAccount sa = new SavingsAccount(150000);
    SavingsAccount.setAnnualInterestRateSA(4.5);
    System.out.println("SavingsAccount------------------------------------------");
    System.out.println("This SavingsAccount was created on " +account.getDateCreated());
    System.out.println("Current Balance: $" +sa.getBalanceSA());
    System.out.println("Deposit: $17000");
    sa.depositSA(17000);
    System.out.println("Withdrawal: $155000");
    sa.withdrawSA(155000);
    System.out.println("Current Balance: $"+sa.getBalanceSA());
    System.out.println("Deposit: $22000.0");
    sa.depositSA(22000);
    System.out.println("Deposit: $36000.0");
    sa.depositSA(36000);
    System.out.println("Current Balance: $"+sa.getBalanceSA());
    System.out.println("Withdrawal: $80000.0");
    sa.withdrawSA(80000);
    System.out.println("Current Balance: $"+sa.getBalanceSA());
    System.out.println("Monthly interest: $" +
    sa.getMonthlyInterestSA());
  }
}