package com.app.controller;

import com.app.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        // 1. Load the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        // 2. Fetch the bean by its ID ("in")
        Country india = context.getBean("in", Country.class);
        
        // 3. Return the Java Object (Spring will convert it to JSON automatically)
        return india;
    }
}