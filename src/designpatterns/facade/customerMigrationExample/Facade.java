package designpatterns.facade.customerMigrationExample;

import designpatterns.facade.customerMigrationExample.subsystem1.crm.CrmService;
import designpatterns.facade.customerMigrationExample.subsystem1.crm.CustomerData;
import designpatterns.facade.customerMigrationExample.subsystem2.zipcode.ZipAPI;

/**
 * Facade class for migrating customer data.
 */
public class Facade {

    /**
     * Migrates customer data based on customer name and zip code.
     * Retrieves city, state, and country information using ZipAPI
     * Retrieves customer email and phone number using CustomerData
     * Records customer information in the CRM system using CrmService
     *
     * @param customerName The name of the customer
     * @param zipCode The zip code of the customer
     */
    public void migrateCustomer(String customerName, String zipCode) {

        // Get customer city, state, and country information
        String customerCity = ZipAPI.getInstance().getCity(zipCode);
        String customerState = ZipAPI.getInstance().getState(zipCode);
        String customerCountry = ZipAPI.getInstance().getCountry(zipCode);

        // Get customer email and phone number
        String customerEmail = CustomerData.customerDataInstance.getCustomerEmail();
        String customerPhoneNumber = CustomerData.customerDataInstance.getCustomerPhoneNumber();

        // Record customer information in the CRM system
        CrmService.recordCustomer(customerName, customerEmail, customerPhoneNumber, zipCode, customerCountry, customerState, customerCity);

    }

}
