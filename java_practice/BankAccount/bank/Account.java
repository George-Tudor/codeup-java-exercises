package bank;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int funds) {
        this.balance += funds;
        System.out.println("New balance = " + this.balance);
    }

    public void withdrawFunds(int funds) {
        if(funds > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= funds;
            System.out.println("New balance = " + this.balance);
        }
    }

    public void customerInfo() {
        System.out.println("Customer info: \n" + "Name: "
                + this.getCustomerName() + "\n"
                + "Account Number: " + this.getAccountNumber() + "\n"
                + "Current Balance: " + this.getBalance() + "\n"
                + "Email: " + this.getEmail() + "\n"
                + "Phone Number: " + this.getPhoneNumber() + "\n");
    }
}
