package com.allianz.tech.referential.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.allianz.tech.referential.entities.Country;

public interface CountryRepository  extends CrudRepository<Country, Integer> {

    
}
