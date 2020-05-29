package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTest {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldDeliverPackageIfWeightIsBelow30() {
        //given
        //when
        String message = bean.sendPackage("Wall Street", 15.5);
        //then
        Assertions.assertEquals("Package delivered to: Wall Street", message);
    }

    @Test
    public void shouldNotDeliverPackageIfWeightIsOver30() {
        //given
        //when
        String message = bean.sendPackage("Wall Street", 35.0);
        //then
        Assertions.assertEquals("Package not delivered to: Wall Street", message);
    }
}