package Class_Object_Constructor_Practice;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("China", 500.00);
        BankAccount account2 = new BankAccount("Larry", 5000.00);
        BankAccount account3 = new BankAccount("Mary", 300.00);

        account1.deposit(100.00);
        account1.accountInfo();


        account2.transfer(account3,100.00);
        account2.accountInfo();
        account3.accountInfo();


    }
}

