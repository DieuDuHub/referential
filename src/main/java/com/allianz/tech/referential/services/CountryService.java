package com.allianz.tech.referential.services;

import com.allianz.tech.referential.entities.Dcx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.allianz.tech.referential.entities.Country;
import com.allianz.tech.referential.repositories.CountryRepository;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAllCountries() {
        Iterable<Country> countries = countryRepository.findAll();
        return StreamSupport.stream(countries.spliterator(), false).collect(Collectors.toList());
    }

    public Country findCountryById(int id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }
}
