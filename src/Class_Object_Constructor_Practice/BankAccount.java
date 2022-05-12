package Class_Object_Constructor_Practice;

import java.util.Scanner;

public class BankAccount {
    private Scanner scanner = new Scanner(System.in);
    private String accountHolder;

    private double accountBalance;

    private Integer accountNumberTracker;

// Class constructor
    public BankAccount( String accountHolder, double accountBalance, Integer accountNumberTracker) {
      this.accountHolder = accountHolder;
      this.accountBalance = accountBalance;
      this.accountNumberTracker = accountNumberTracker;
    }

    public BankAccount() {
        System.out.println("What is the name for the account?");
        this.accountHolder = scanner.nextLine();
        System.out.println("What is the beginning balance for the account? ");
        this.accountBalance = Integer.valueOf(scanner.nextLine());

    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public Double getAccountBalance() {
        return accountBalance;
    }

    public Integer getAccountNumberTracker(){
        return accountNumberTracker;
    }

    public void setAccountNumberTracker(Integer accountNumberTracker) {
        this.accountNumberTracker = accountNumberTracker;
    }

    public double deposit(Double amountToDeposit) {
       accountBalance += amountToDeposit;
       return amountToDeposit;
    }

    public double withdrawal(Double amountWithdrew) {
        accountBalance -= amountWithdrew;
        return amountWithdrew;
    }

    public Double transfer(BankAccount acc, double amount) {
//        withdrawal(amount);
//        acc.deposit(amount);
        return acc.deposit((this.withdrawal(amount)));

    }

    public String toString() {
        return "Account Balance: " + getAccountBalance();
    }

//    public void accountInfo() {
//        System.out.println("Account Holder: " + accountHolder + "\n" + "Account Balance: " + accountBalance);
//    }
}
