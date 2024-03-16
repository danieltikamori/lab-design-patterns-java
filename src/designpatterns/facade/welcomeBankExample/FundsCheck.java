package designpatterns.facade.welcomeBankExample;

/**
 * Represents a bank account with funds check functionality.
 */
public class FundsCheck {
    private double cashInAccount = 1000.00;

    /**
     * Decreases the cash in the account by the specified amount.
     * @param cashToWithdraw the amount to withdraw
     */
    public void decreaseCashInAccount(double cashToWithdraw) {
        cashInAccount -= cashToWithdraw;
    }

    /**
     * Increases the cash in the account by the specified amount.
     * @param cashToDeposit the amount to deposit
     */
    public void increaseCashInAccount(double cashToDeposit) {
        cashInAccount += cashToDeposit;
    }

    /**
     * Checks if the account has sufficient funds for the specified withdrawal amount.
     * @param cashToWithdraw the amount to withdraw
     * @return true if the account has sufficient funds, false otherwise
     */
    public boolean hasSufficientFunds(double cashToWithdraw) {
        if (cashToWithdraw > getCashInAccount()) {
            System.out.println("Insufficient funds");
            System.out.println("You have " + getCashInAccount() + " in your account");
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrew " + cashToWithdraw);
            System.out.println("You have " + getCashInAccount() + " in your account");
            return true;
        }
    }

    /**
     * Makes a deposit to the account.
     * @param cashToDeposit the amount to deposit
     */
    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposited " + cashToDeposit);
        System.out.println("You have " + getCashInAccount() + " in your account");
    }

    /**
     * Gets the current cash in the account.
     * @return the cash in the account
     */
    public double getCashInAccount() {
        return cashInAccount;
    }
}