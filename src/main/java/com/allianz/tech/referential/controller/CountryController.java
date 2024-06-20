package com.allianz.tech.referential.controller;

import com.allianz.tech.referential.entities.Country;
import com.allianz.tech.referential.entities.Dcx;
import com.allianz.tech.referential.services.CountryService;
import com.allianz.tech.referential.services.DcxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("referential")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping ("/countries")
    public List<Country> getAllCountries() {
        return countryService.findAllCountries();
    }

    // Add a new endpoint to get a dcx by id
    @GetMapping("/country/{id}")
    public Country getCountryById(@PathVariable Integer id) {
        return countryService.findCountryById(id);
    }

    // create a new endpoint to create a dcx
    @PostMapping("/country")
    public Country createDcx(@RequestBody Country dcx) {
        return countryService.saveCountry(dcx);
    }
} 