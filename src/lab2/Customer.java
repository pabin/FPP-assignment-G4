package lessontwo;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Adress shippingAddress;
    private Adress billingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Adress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Adress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Adress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Adress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

}
