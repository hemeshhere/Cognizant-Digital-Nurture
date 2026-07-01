package com.app.service;

import com.app.entity.Country;
import com.app.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> findCountriesContaining(String text) {
        return countryRepository.findByCoNameContaining(text);
    }

    public List<Country> findCountriesStartingWith(String prefix) {
        return countryRepository.findByCoNameStartingWith(prefix);
    }

    public List<Country> findCountriesContainingAndSort(String text) {
        return countryRepository.findByCoNameContainingOrderByCoNameAsc(text);
    }
}