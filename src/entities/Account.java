package entities;
public class Account {
    private final int accountNumber;
    private String accountName;
    private double balance;

    // CONSTRUTOR
    public Account(int accountNumber, String accountName, double initialDeposit) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        depositAccount(initialDeposit);
    }
    public Account(int accountNumber, String accountName) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    // GETTERS E SETTERS
    public void setAccountName(String accountName) { //
        this.accountName = accountName;
    }
    public String getAccountName() {
        return accountName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    // OPERAÇÕES

    public void depositAccount(double amount) {
        balance += amount;
    }
    public void withdrawAccount(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", holder: "
                + accountName
                + ", balance: $ "
                + String.format("%.2f", balance);
    }
}
