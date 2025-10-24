public class SimpleBankDemo {
    public static void main(String[] args) {
        // Create banking system
        BankingSystem bank = new BankingSystem();
        
        // Create companies
        Company company1 = new Company("COMP001", "ABC Corporation", "123 Business Road", 
                                      "REG12345", "contact@abccorp.com", "3912345");
        
        Company company2 = new Company("COMP002", "XYZ Enterprises", "456 Commerce Street", 
                                      "REG67890", "info@xyzenterprises.com", "3976543");
        
        // Add companies to bank
        bank.addCompany(company1);
        bank.addCompany(company2);
        
        // Create customers with company reference
        Customer customer1 = new Customer("CUST001", "John", "john@email.com", "Doe", 
                                         "pass123", true, company1);
        
        Customer customer2 = new Customer("CUST002", "Jane", "jane@email.com", "Smith", 
                                         "pass456", false, null);
        
        // Create organization customer (the company itself as a customer)
        Customer companyCustomer = new Customer("CUST003", "ABC Corporation", "contact@abccorp.com", 
                                               "", "comp123", true, company1);
        
        // Create employee
        Employee employee = new Employee("EMP001", "Bob", "bob@bank.com", "Johnson", "emp123");
        
        // Add to bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(companyCustomer);
        bank.addEmployee(employee);
        
        // Create accounts
        SavingsAccount savings = new SavingsAccount("SAV001", customer1, 1000);
        InvestmentAccount investment = new InvestmentAccount("INV001", customer1, 600);
        ChequeAccount cheque = new ChequeAccount("CHQ001", customer1, 500, company1);
        
        // Company account
        ChequeAccount companyCheque = new ChequeAccount("CHQ002", companyCustomer, 10000, company1);
        
        // Add accounts to bank
        bank.addAccount(savings);
        bank.addAccount(investment);
        bank.addAccount(cheque);
        bank.addAccount(companyCheque);
        
        // Test basic operations
        bank.processDeposit("SAV001", 500);
        bank.processWithdrawal("SAV001", 200); // Should return false (no withdrawals from savings)
        bank.processWithdrawal("CHQ001", 300); // Should return true
        bank.processDeposit("CHQ002", 5000);   // Company deposit
        
        // Apply interest
        bank.applyMonthlyInterest();
        
        System.out.println("Basic banking system with Company class initialized successfully");
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Cheque balance: " + cheque.getBalance());
        System.out.println("Company cheque balance: " + companyCheque.getBalance());
        System.out.println("Total companies registered: " + bank.getCompanies().size());
        System.out.println("Company employer for cheque account: " + cheque.getEmployer().getCompanyName());
    }
}