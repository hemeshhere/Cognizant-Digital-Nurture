package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.entity.Country;
import com.app.service.CountryService;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        CountryService countryService = context.getBean(CountryService.class);
        
        LOGGER.info(" Start Query Methods Test ");
        
        List<Country> containingResult = countryService.findCountriesContaining("ia");
        LOGGER.info("Countries containing 'ia':");
        for (Country c : containingResult) {
            LOGGER.info("- {}", c.getCoName()); 
        }

        List<Country> startingResult = countryService.findCountriesStartingWith("A");
        LOGGER.info("Countries starting with 'A':");
        for (Country c : startingResult) {
            LOGGER.info("- {}", c.getCoName());
        }

        List<Country> sortedResult = countryService.findCountriesContainingAndSort("a");
        LOGGER.info("Countries containing 'a' sorted alphabetically:");
        for (Country c : sortedResult) {
            LOGGER.info("- {}", c.getCoName());
        }

        LOGGER.info(" End Query Methods Test ");
    }
}