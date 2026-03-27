class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accNo, double balance, double limit) {
        super(accNo, balance);
        this.overdraftLimit = limit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}