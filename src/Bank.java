import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void displayAccounts() {
        for (BankAccount acc : accounts) {
            acc.showBalance();
        }
    }
}