package designpatterns.facade.welcomeBankExample;

/**
 * The SecurityCodeCheck class handles the security code verification for the Welcome Bank example.
 */
public class SecurityCodeCheck {
    private String securityCode = "1234";

    /**
     * Checks if the provided security code matches the stored security code.
     * @param secCodeToCheck The security code to check.
     * @return true if the provided security code matches the stored security code, false otherwise.
     */
    public boolean isCodeCorrect(String secCodeToCheck) {
        return securityCode.equals(secCodeToCheck);
    }

    /**
     * Retrieves the stored security code.
     * @return The stored security code.
     */
    public String getSecurityCode() {
        return securityCode;
    }
}