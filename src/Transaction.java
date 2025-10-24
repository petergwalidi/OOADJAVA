import java.util.Date;

public class Transaction {
    // Attributes only
    private String transactionId;
    private Date date;
    private String type;
    private double amount;
    private double balanceAfter;
    
    // Constructor
    public Transaction(String transactionId, Date date, String type, double amount, double balanceAfter) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }
    
    // Getters only
    public String getTransactionId() { return transactionId; }
    public Date getDate() { return date; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public double getBalanceAfter() { return balanceAfter; }
}