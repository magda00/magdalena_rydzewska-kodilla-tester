package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/source.csv", numLinesToSkip = 1)
    public void shouldReturnCarTypeDependOnSeason(String season, String type, String hour, boolean lights) {
        //Given
        LocalTime time = LocalTime.parse(hour);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carDependentOnSeason", season, time);

        //When
        boolean lightsTurnedOn = car.hasHeadlightsTurnedOn();
        String carType = car.getCarType();

        //Then
        Assertions.assertEquals(type, carType);
        assertEquals(lights, lightsTurnedOn);

    }

}