class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.deposit(200);
        sa.withdraw(550);
        sa.withdraw(100);
    }
}
