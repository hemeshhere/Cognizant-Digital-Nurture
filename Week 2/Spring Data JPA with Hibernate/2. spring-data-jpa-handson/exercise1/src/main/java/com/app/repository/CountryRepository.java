package com.app.repository;

import com.app.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    
    List<Country> findByCoNameContaining(String name);

    List<Country> findByCoNameStartingWith(String prefix);
    
    List<Country> findByCoNameContainingOrderByCoNameAsc(String name);
}