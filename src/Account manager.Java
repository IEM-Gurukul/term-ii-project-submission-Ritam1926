public class AccountManager {
    private Bank bank;

    public AccountManager(Bank bank) {
        this.bank = bank;
    }

    public void deposit(int accNo, double amount) {
        BankAccount acc = bank.findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accNo, double amount) {
        BankAccount acc = bank.findAccount(accNo);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }
}