package Class_Object_Constructor_Practice;

public class BankAccount {
    private String accountHolder;

    private double accountBalance;

// Class constructor
    public BankAccount( String accountHolder, double accountBalance) {
      this.accountHolder = accountHolder;
      this.accountBalance = accountBalance;
    }

    public void deposit( Double amountToDeposit) {
        accountBalance += amountToDeposit;
    }

    public void withdrawal(Double amountWithdrew) {

        accountBalance -= amountWithdrew;
    }

    public void accountInfo() {
        System.out.println("Account Holder: " + accountHolder + "\n" + "Account Balance: " + accountBalance);
    }
}
