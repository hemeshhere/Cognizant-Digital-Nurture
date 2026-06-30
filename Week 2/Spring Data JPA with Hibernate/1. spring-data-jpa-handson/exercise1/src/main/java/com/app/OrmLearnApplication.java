package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.entity.Country;
import com.app.service.CountryService;
import com.app.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        
        try {
            // Your previous test
            getAllCountriesTest();
            
            // Your NEW test for Exercise 7
            testAddCountry();
            
        } catch (CountryNotFoundException e) {
            LOGGER.error("Error fetching country: {}", e.getMessage());
        }
    }

    private static void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start getAllCountriesTest");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country:{}", country);
        LOGGER.info("End getAllCountriesTest\n");
    }

    // --- NEW METHOD FOR HANDS-ON 7 ---
    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start testAddCountry");
        
        // 1. Create new instance of country
        Country newCountry = new Country("MM", "Myanmar");
        
        // 2. Call service to add the country
        countryService.addCountry(newCountry);
        LOGGER.debug("Country successfully saved to database.");
        
        // 3. Find the country to verify it was added
        Country retrievedCountry = countryService.findCountryByCode("MM");
        
        // 4. Check/Log the result
        LOGGER.debug("Retrieved newly added Country: {}", retrievedCountry.getCoName());
        
        LOGGER.info("End testAddCountry\n");
    }
}