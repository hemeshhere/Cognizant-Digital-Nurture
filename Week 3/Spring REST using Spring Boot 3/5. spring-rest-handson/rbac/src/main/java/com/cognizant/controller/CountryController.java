package com.cognizant.controller;

import com.cognizant.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("US", "United States"));
        list.add(new Country("DE", "Germany"));
        list.add(new Country("IN", "India"));
        list.add(new Country("JP", "Japan"));
        return list;
    }
}