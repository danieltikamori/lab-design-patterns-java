package designpatterns.facade.welcomeBankExample;

// The Facade Design Pattern decouples or separates the client
// from all  the subcomponents

// The Facades aim is to simplify interfaces, so you don't have
// to worry about what is going on under the hood

public class BankAccountFacade {
    // Account number of the bank account
    private String accountNumber;

    // Security code of the bank account
    private String securityCode;

    // Instance of AccountNumberCheck class to check the validity of account number
    private AccountNumberCheck accountNumberCheck;

    // Instance of SecurityCodeCheck class to check the validity of security code
    private SecurityCodeCheck securityCodeCheck;

    // Instance of FundsCheck class to check the availability of funds
    private FundsCheck fundsChecker;

    // Instance of WelcomeToBank class to greet the user
    WelcomeToBank bankWelcome;

    /**
     * Constructor for BankAccountFacade class
     * @param newAccountNumber: String - new account number
     * @param newSecurityCode: String - new security code
     */
    public BankAccountFacade (String newAccountNumber, String newSecurityCode) {
        accountNumber = newAccountNumber;
        securityCode = newSecurityCode;

        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();

        bankWelcome = new WelcomeToBank();
    }

    /**
     * Getter for account number
     * @return: String - account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter for security code
     * @return: String - security code
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Method to withdraw cash from the bank account
     * @param amountToWithdraw: double - amount to be withdrawn
     */
    public void withDrawCash (double amountToWithdraw) {
        // Check if the account number and security code are valid and if the account has sufficient funds
        if (accountNumberCheck.accountExists(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode()) && fundsChecker.hasSufficientFunds(amountToWithdraw)) {
            System.out.println("Transaction successful\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }

    /**
     * Method to deposit cash into the bank account
     * @param amountToDeposit: double - amount to be deposited
     */
    public void depositCash (double amountToDeposit) {
        // Check if the account number and security code are valid
        if (accountNumberCheck.accountExists(getAccountNumber()) && securityCodeCheck.isCodeCorrect(getSecurityCode())) {
            fundsChecker.makeDeposit(amountToDeposit);
            System.out.println("Transaction successful\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }
}