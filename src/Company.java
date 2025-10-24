public class Company {
    // Attributes only
    private String companyId;
    private String companyName;
    private String companyAddress;
    private String registrationNumber;
    private String contactEmail;
    private String phoneNumber;
    
    // Constructor
    public Company(String companyId, String companyName, String companyAddress, 
                  String registrationNumber, String contactEmail, String phoneNumber) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.registrationNumber = registrationNumber;
        this.contactEmail = contactEmail;
        this.phoneNumber = phoneNumber;
    }
    
    // Getters only
    public String getCompanyId() { return companyId; }
    public String getCompanyName() { return companyName; }
    public String getCompanyAddress() { return companyAddress; }
    public String getRegistrationNumber() { return registrationNumber; }
    public String getContactEmail() { return contactEmail; }
    public String getPhoneNumber() { return phoneNumber; }
}