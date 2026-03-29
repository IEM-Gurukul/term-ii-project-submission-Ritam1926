public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        AccountManager manager = new AccountManager(bank);

        SavingsAccount sa = new SavingsAccount(101, 5000, 5);
        CurrentAccount ca = new CurrentAccount(102, 3000, 2000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        manager.deposit(101, 1000);
        manager.withdraw(102, 4000);

        sa.addInterest();

        bank.displayAccounts();
    }
}