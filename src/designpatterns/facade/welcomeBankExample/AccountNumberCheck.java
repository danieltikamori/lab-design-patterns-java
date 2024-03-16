package designpatterns.facade.welcomeBankExample;

/**
 * The AccountNumberCheck class is responsible for checking the validity of an account number.
 */
public class AccountNumberCheck {
    private String accountNumber = "123456789";

    /**
     * Checks if the provided account number exists.
     * @param accountNumberToCheck The account number to check
     * @return true if the account number exists, false otherwise
     */
    public boolean accountExists(String accountNumberToCheck) {
        return accountNumberToCheck.equals(accountNumber);
    }

    /**
     * Retrieves the account number.
     * @return The account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }
}