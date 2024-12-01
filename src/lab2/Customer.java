package lab2;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address shippingAddress;
    private Address billingAddress;

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

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

    public static void main(String[] args) {
        Address adress = new Address("str763811", "Chicago", "763811");
        Address adress1 = new Address("str119029", "Knoxville", "119029");
        Address adress2 = new Address("str319029", "Louiville", "319029");

        Customer customer = new Customer("Joe", "Smith", "332-221-4444");
        customer.setBillingAddress(adress);
        customer.setShippingAddress(adress1);

        Customer customer1 = new Customer("Joe", "Smith", "332-221-4444");
        customer1.setBillingAddress(adress1);
        customer1.setShippingAddress(adress2);

        Customer customer2 = new Customer("Joe", "Smith", "332-221-4444");
        customer2.setBillingAddress(adress);
        customer2.setShippingAddress(adress2);

        Customer[] customers = new Customer[3];
        customers[0] = customer;
        customers[1] = customer1;
        customers[2] = customer2;

        for(int i = 0; i < customers.length; i++) {
            if(customers[i].getBillingAddress().getCity() == "Chicago") {
                System.out.println(customers[i].toString());
            }
        }

        System.out.printf(customer.getBillingAddress().getCity());

    }

}
