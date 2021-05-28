package section6oopPart1;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //declare default values for objects:
    public BankAccount() {
        this(12345, 0, "default name", "default email", "default phone");
    }



    public BankAccount(int accountNumber, int balance, String customerName,
                       String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999, 100, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // SETTERS

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
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

    public int depositFunds(int depositAmount) {
        int newBalance = this.balance += depositAmount;
        System.out.println("Your new balance after the deposit is: $" + newBalance);
        return newBalance;
    }

    public void withdrawFunds(int withdrawlAmount) {

        if(this.balance - withdrawlAmount >= 0) {
            this.balance -= withdrawlAmount;
            System.out.println("Your new balance after the withdrawl is: $" + this.balance);
        } else {
            System.out.println("Insufficient funds.  Your balance is: $" + this.balance);

        }


    }
}
