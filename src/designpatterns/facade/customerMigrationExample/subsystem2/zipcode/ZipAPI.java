package designpatterns.facade.customerMigrationExample.subsystem2.zipcode;

/**
 * The ZipAPI class provides methods for retrieving information related to zip codes.
 */
public class ZipAPI {

    private static ZipAPI instance = new ZipAPI();

    private ZipAPI() {
        super();
    }

    /**
     * Returns the instance of the ZipAPI class.
     * @return the instance of the ZipAPI class
     */
    public static ZipAPI getInstance() {
        return instance;
    }

    /**
     * Retrieves the zip code for the given customer zip code.
     * @param customerZipCode the customer zip code
     * @return the zip code
     */
    public String getZip(String customerZipCode) {
        return "12345";
    }

    /**
     * Retrieves the country for the given customer country.
     * @param customerCountry the customer country
     * @return the country
     */
    public String getCountry(String customerCountry) {
        return "USA";
    }

    /**
     * Retrieves the city for the given customer city.
     * @param customerCity the customer city
     * @return the city
     */
    public String getCity(String customerCity) {
        return "Anytown";
    }

    /**
     * Retrieves the state for the given customer state.
     * @param customerState the customer state
     * @return the state
     */
    public String getState(String customerState) {
        return "CA";
    }

    // The following two methods ensure that only one instance of ZipAPI exists.

    private Object readResolve() {
        return getInstance();
    }

    private Object writeReplace() {
        return getInstance();
    }

}