import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Attributes only
    private String customerId;
    private String name;
    private String email;
    private String surname;
    private String password;
    private boolean isEmployed;
    private Company employer;  // Changed from String to Company object
    private List<Account> accounts;
    
    // constructor for the individual customer
    public Customer(String customerId, String name, String email, String surname, 
                   String password, boolean isEmployed, Company employer) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.password = password;
        this.isEmployed = isEmployed;
        this.employer = employer;
        this.accounts = new ArrayList<>();
    }
    
    // Basic business logic only
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    // Getters only
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getSurname() { return surname; }
    public String getPassword() { return password; }
    public boolean isEmployed() { return isEmployed; }
    public Company getEmployer() { return employer; }
    public List<Account> getAccounts() { return accounts; }
}