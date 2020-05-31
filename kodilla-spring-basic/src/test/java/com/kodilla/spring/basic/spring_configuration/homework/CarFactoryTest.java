package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

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