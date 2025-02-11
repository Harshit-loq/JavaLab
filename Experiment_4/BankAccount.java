class BankAccount {
    private double b;  // Private variable
    // Constructor to initialize balance
    BankAccount(double inialB) {
        this.b = inialB;
    }
    // Public method to deposit money
    public void deposit(double amount) {
        b += amount;
        System.out.println("Deposited: " + amount);
    }
    // Protected method to withdraw money
    protected void withdraw(double amount) {
        if (amount <= b) {
            b -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + b);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.checkBalance();
        
        account.withdraw(300);
        account.checkBalance();
    }
}
