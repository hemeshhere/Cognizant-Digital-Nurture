package com.app.repository;

import com.app.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, String> {
    
    // Spring translates this to: SELECT * FROM country WHERE co_name LIKE %partialName%
    List<Country> findByCoNameContainingIgnoreCase(String partialName);

    Optional<Country> findById(String code);

    boolean existsById(String code);

    Country save(Country country);

    void deleteById(String code);
    
}