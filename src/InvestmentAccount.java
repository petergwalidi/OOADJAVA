public class InvestmentAccount extends Account {
    // Attributes only
    private static final double INTEREST_RATE = 0.05; // 5%
    private static final double MINIMUM_BALANCE = 500.00;
    
    // Constructor
    public InvestmentAccount(String accountNumber, Customer owner, double initialBalance) {
        super(accountNumber, owner, initialBalance);
    }
    
    // Basic business logic only
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
    }
    
    // Getters only
    public double getInterestRate() { return INTEREST_RATE; }
    public double getMinimumBalance() { return MINIMUM_BALANCE; }
}