package designpatterns.facade.customerMigrationExample;

/**
 * Main class to demonstrate customer migration using a Facade.
 */
public class MigrationAppMain {
    /**
     * Main method to start the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrateCustomer("John Travolta", "1616161616");
        System.out.println("Customer migrated successfully!");
    }
}