import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    // Attributes only
    protected String accountNumber;
    protected double balance;
    protected Customer owner;
    protected List<Transaction> transactions;
    
    // Constructor
    public Account(String accountNumber, Customer owner, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }
    
    // Basic business logic only
    public void deposit(double amount) {
        balance += amount;
    }
    
    public abstract boolean withdraw(double amount);
    
    // Getters only
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public Customer getOwner() { return owner; }
    public List<Transaction> getTransactions() { return transactions; }
}