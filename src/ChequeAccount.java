public class ChequeAccount extends Account {
    // Attributes only
    private Company employer;  // Changed from String to Company object
    
    // Constructor
    public ChequeAccount(String accountNumber, Customer owner, double initialBalance, 
                        Company employer) {
        super(accountNumber, owner, initialBalance);
        this.employer = employer;
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
    
    // Getters only
    public Company getEmployer() { return employer; }
}