public class Employee {
    // Attributes only
    private String employeeId;
    private String name;
    private String email;
    private String surname;
    private String password;
    
    // Constructor
    public Employee(String employeeId, String name, String email, String surname, String password) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.password = password;
    }
    
    // Getters only
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getSurname() { return surname; }
    public String getPassword() { return password; }
}