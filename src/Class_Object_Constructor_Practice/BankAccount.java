package Class_Object_Constructor_Practice;

public class BankAccount {
    private String accountHolder;

    private double accountBalance;

// Class constructor
    public BankAccount( String accountHolder, double accountBalance) {
      this.accountHolder = accountHolder;
      this.accountBalance = accountBalance;
    }

    public double deposit( Double amountToDeposit) {
       accountBalance += amountToDeposit;
       return amountToDeposit;
    }

    public double withdrawal(Double amountWithdrew) {
        accountBalance -= amountWithdrew;
        return amountWithdrew;
    }

    public Double transfer(BankAccount acc, double amount) {
       return acc.deposit((this.withdrawal(amount)));

    }

    public void accountInfo() {
        System.out.println("Account Holder: " + accountHolder + "\n" + "Account Balance: " + accountBalance);
    }
}
