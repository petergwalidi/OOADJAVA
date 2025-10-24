public class SavingsAccount extends Account {
    // Attributes only
    private static final double INTEREST_RATE = 0.0005; // 0.05%
    
    // Constructor
    public SavingsAccount(String accountNumber, Customer owner, double initialBalance) {
        super(accountNumber, owner, initialBalance);
    }
    
    @Override
    public boolean withdraw(double amount) {
        // Withdrawals not allowed for savings account
        return false;
    }
    
    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
    }
    
    // Getters only
    public double getInterestRate() { return INTEREST_RATE; }
}