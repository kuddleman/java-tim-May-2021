package section6oopPart1;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer( String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("default name", 1000, "default email");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default email");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Credit Limit: " + creditLimit + "\n" +
                "Email: " + email;
    }
}
