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
        // Boot up Spring and grab the context
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        
        // Retrieve the service bean from the Spring Context
        countryService = context.getBean(CountryService.class);
        
        // Invoke the test method
        try {
            getAllCountriesTest();
        } catch (CountryNotFoundException e) {
            LOGGER.error("Error fetching country: {}", e.getMessage());
        }
    }

    private static void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start");
        // Testing the findCountryByCode method with "IN" (Ensure "IN" is in your data.sql!)
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country:{}", country);
        LOGGER.info("End");
    }
}