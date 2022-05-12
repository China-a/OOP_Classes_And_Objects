package Class_Object_Constructor_Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBankAccount {

    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("China", 500.00);
//        BankAccount account2 = new BankAccount("Larry", 5000.00);
//        BankAccount account3 = new BankAccount("Mary", 300.00);
//
//        account1.deposit(100.00);
//        account1.accountInfo();
//
//
//        account2.transfer(account3,100.00);
//        account2.accountInfo();
//        account3.accountInfo();


        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        accounts.add(new BankAccount("Matt", 6000, 1));

        while (true) {
            System.out.println("Hello!");
            System.out.println("Are you an exist customer? \n1.Yes\n2.No");
            Integer isAMember = Integer.valueOf(scanner.nextLine());
            if (isAMember.equals(1)) {
                mainMenu(accountMembers(accounts), accounts);
                break;
            }
            if (isAMember.equals(2)) {
                System.out.println("Let's make a new account!");
                BankAccount newMember = new BankAccount();
                newMember.setAccountNumberTracker(accounts.size()+1);
                accounts.add(newMember);
                mainMenu(newMember,accounts);
                break;
            }

        }
    }
    public static BankAccount accountMembers(ArrayList<BankAccount> accounts) {
        Scanner scan = new Scanner(System.in);
        Integer accountEntry = 0;

        for (int i = 0; i <accounts.size();i++){
        }
        while (true) {
            System.out.println("Please enter in the account number you would like to transfer money to");
            int accountNum = scan.nextInt();
            if (accountNum <= accounts.size() && accountNum >= 1) {
                accountEntry = accountNum - 1;
                break;
            } else {
                System.out.println("Account number invalid");
            }
        }
        return accounts.get(accountEntry);
    }


    private static void mainMenu(BankAccount  accountMembers, ArrayList<BankAccount> accounts) {
        while(true) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("welcome " + accountMembers.getAccountHolder());
          System.out.println("Welcome to the Main Menu \n What would you like to do today?" );
          System.out.println("1.To check account balance" + "\n"
          + "2.To make a withdraw" + "\n"
          + "3.To make a deposit" + "\n"
          + "4.To make a transfer to another account" + "\n"
          + "0.To exit");
            Integer userInput = Integer.valueOf(scanner.nextLine());
            if (userInput.equals(1)) {
                System.out.println(accountMembers.toString());

            }
            if(userInput.equals(2)) {
                System.out.println("How much would you like to withdraw?");
                Double amountWithdrew = Double.valueOf(scanner.nextLine());
                System.out.println("Withdrawal amount is " + accountMembers.withdrawal(amountWithdrew));
                System.out.println("Account Balance: " + accountMembers.getAccountBalance());
            }
            if(userInput.equals(3)) {
                System.out.println("How much would you like to deposit?");
                Double amountToDeposit = Double.valueOf(scanner.nextLine());
                System.out.println("Deposited amount is " + accountMembers.deposit(amountToDeposit));
                System.out.println("Account Balance: " + accountMembers.getAccountBalance());
            }
            if(userInput.equals(4)) {
                    BankAccount receiver = accountMembers(accounts);
                System.out.println("Please enter the amount to transfer");
                Double userTransferAmount = Double.valueOf(scanner.nextLine());

                accountMembers.transfer(receiver, userTransferAmount );
                    System.out.println("The name on the account is: " + accountMembers.getAccountHolder() + " and they transferred " + userTransferAmount + " and has a balance of " + accountMembers.getAccountBalance());
                    System.out.println("The name on the account is: " + receiver.getAccountHolder() + " and they received " + userTransferAmount + " and has a balance of " + receiver.getAccountBalance());
            }
            if(userInput.equals(0)) {
                break;
            }
            }
      }
}