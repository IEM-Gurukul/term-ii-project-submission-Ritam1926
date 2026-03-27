abstract class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void showBalance() {
        System.out.println("Account No: " + accountNumber + ", Balance: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}