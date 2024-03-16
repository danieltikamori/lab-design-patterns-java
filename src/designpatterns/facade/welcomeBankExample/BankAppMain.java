package designpatterns.facade.welcomeBankExample;

/**
 * This is the main class for the BankApp.
 * It's responsible for creating a BankAccountFacade and using it to perform operations.
 */
public class BankAppMain {

    /**
     * The main method of the BankApp.
     * It creates a BankAccountFacade and uses it to deposit and withdraw cash.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        // Create a new BankAccountFacade with the bank account number and password.
        BankAccountFacade bankAccountFacade = new BankAccountFacade("123456789", "1234");

        // Deposit 1000 units of currency into the bank account.
        bankAccountFacade.depositCash(1000);

        // Withdraw 500 units of currency from the bank account.
        bankAccountFacade.withDrawCash(500);
    }
}