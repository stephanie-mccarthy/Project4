public class Account {
    private double balance;
    private int accountNum;
    private static int numberOfAccounts = 1000;

    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        this.accountNum = ++numberOfAccounts;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Updated Balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Updated Balance: $" + balance);
        }
    }
    public String toString() {
        return "Account Number: " + accountNum + ", Balance: $" + balance;
    }
    public int getAccountNumber() {
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}