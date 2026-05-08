// Custom Exception: LowBalanceException
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception: NegativeNumberException
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount class with core operations
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}

// Main class to demonstrate functionality
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial balance ₹5000

        try {
            account.balanceEnquiry();
            account.deposit(1500);
            account.withdraw(2000);
            account.withdraw(6000); // Will trigger LowBalanceException
            account.deposit(-100);  // Will trigger NegativeNumberException
        } catch (LowBalanceException e) {
            System.out.println("LowBalanceException: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("NegativeNumberException: " + e.getMessage());
        }

        account.balanceEnquiry();
    }
}
