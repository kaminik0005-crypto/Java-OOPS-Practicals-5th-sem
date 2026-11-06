class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String name, int number, double amount) {
        accountHolder = name;
        accountNumber = number;
        balance = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        }
    }
}

public class practical10_BankAccount {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Kamini", 101, 5000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("\nValid Transactions:");

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("\nInvalid Transactions:");

        account.deposit(-500);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}
