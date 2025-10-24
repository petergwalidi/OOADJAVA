import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    // Attributes only
    private List<Customer> customers;
    private List<Employee> employees;
    private List<Account> accounts;
    private List<Company> companies;  // Added companies list
    
    // Constructor
    public BankingSystem() {
        this.customers = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.companies = new ArrayList<>();  // Initialize companies list
    }
    
    // Basic business logic only
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
        account.getOwner().addAccount(account);
    }
    
    public void addCompany(Company company) {
        companies.add(company);
    }
    
    public boolean processDeposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null && amount > 0) {
            account.deposit(amount);
            return true;
        }
        return false;
    }
    
    public boolean processWithdrawal(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            return account.withdraw(amount);
        }
        return false;
    }
    
    public void applyMonthlyInterest() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).applyInterest();
            } else if (account instanceof InvestmentAccount) {
                ((InvestmentAccount) account).applyInterest();
            }
        }
    }
    
    // Helper methods
    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    public Company findCompanyById(String companyId) {
        for (Company company : companies) {
            if (company.getCompanyId().equals(companyId)) {
                return company;
            }
        }
        return null;
    }
    
    // Getters only
    public List<Customer> getCustomers() { return customers; }
    public List<Employee> getEmployees() { return employees; }
    public List<Account> getAccounts() { return accounts; }
    public List<Company> getCompanies() { return companies; }  // Added getter
}