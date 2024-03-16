package designpatterns.facade.customerMigrationExample.subsystem1.crm;

/**
 * Represents customer data including email and phone number.
 */
public class CustomerData {
    // String customerName = "John Travolta";

    /** The customer's email address. */
    String customerEmail = "travolta@gmail.com";

    /** The customer's phone number. */
    String customerPhoneNumber = "+1-650-555-1212";

    /** The singleton instance of CustomerData. */
    public static CustomerData customerDataInstance = new CustomerData();

    private CustomerData() {
        super();
    }

    /**
     * Returns the singleton instance of CustomerData.
     *
     * @return The singleton instance of CustomerData.
     */
    public static CustomerData getInstance() {
        return customerDataInstance;
    }

    // public String getCustomerName() {
    // return customerName;
    // }

    /**
     * Gets the customer's email address.
     *
     * @return The customer's email address.
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Gets the customer's phone number.
     *
     * @return The customer's phone number.
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     * Ensures singleton pattern is maintained during deserialization.
     *
     * @return The singleton instance of CustomerData.
     */
    private Object readResolve(){
        return getInstance();
    }

    /**
     * Ensures singleton pattern is maintained during serialization.
     *
     * @return The singleton instance of CustomerData.
     */
    private Object writeReplace(){
        return getInstance();
    }
}