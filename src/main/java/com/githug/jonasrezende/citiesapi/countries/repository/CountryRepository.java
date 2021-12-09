package com.githug.jonasrezende.citiesapi.countries.repository;

import com.githug.jonasrezende.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
