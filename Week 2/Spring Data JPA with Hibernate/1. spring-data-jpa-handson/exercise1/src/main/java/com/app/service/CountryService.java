package com.app.service;

import com.app.entity.Country;
import com.app.repository.CountryRepository;
import com.app.service.exception.CountryNotFoundException; // Make sure this matches your exception package
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // UPDATED METHOD
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + countryCode);
        }
        
        return result.get();
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }
    
    public Country updateCountry(String code, Country updatedCountry) {
        if (countryRepository.existsById(code)) {
            updatedCountry.setCoCode(code); // Ensure the code doesn't change
            return countryRepository.save(updatedCountry);
        }
        throw new RuntimeException("Country not found with code: " + code);
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> searchByPartialName(String partialName) {
        return countryRepository.findByCoNameContainingIgnoreCase(partialName);
    }
}