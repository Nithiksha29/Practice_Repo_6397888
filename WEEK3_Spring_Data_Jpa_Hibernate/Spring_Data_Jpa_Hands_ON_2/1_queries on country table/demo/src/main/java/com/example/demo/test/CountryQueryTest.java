package com.example.demo.test;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryQueryTest implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void run(String... args) {
        System.out.println("--- Query 1: Countries containing 'ou' ---");
        List<Country> countries = countryRepository.findByNameContainingIgnoreCase("ou");
        countries.forEach(System.out::println);

        System.out.println("\n--- Query 2: Sorted ascending ---");
        countries = countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc("ou");
        countries.forEach(System.out::println);

        System.out.println("\n--- Query 3: Starting with 'Z' ---");
        countries = countryRepository.findByNameStartingWithIgnoreCase("Z");
        countries.forEach(System.out::println);
    }

}
