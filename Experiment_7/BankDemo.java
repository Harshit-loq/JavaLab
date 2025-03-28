
interface Bank {

    void deposit(double amount);

    void withdraw(double amount);
}

class Account implements Bank {

    private double balance;

    public Account() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(500);
        account.displayBalance();
        account.withdraw(200);
        account.displayBalance();
        account.withdraw(400);
        account.displayBalance();
    }
}
