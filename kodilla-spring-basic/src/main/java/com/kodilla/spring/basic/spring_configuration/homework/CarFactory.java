package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

@Configuration
public class CarFactory {

    @Bean
    @Scope("prototype")

    public Car carDependentOnSeason(String season, LocalTime time) {
        boolean isTurned = time.isAfter(LocalTime.of(20, 0, 0)) || time.isBefore(LocalTime.of(6, 0, 0));
        if (season.equals("Summer")) {
            return new Cabrio(isTurned);
        } else if (season.equals("Spring") || season.equals("Autumn")) {
            return new Sedan(isTurned);
        } else {
            return new SUV(isTurned);
        }
    }
}
