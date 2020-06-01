package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTest {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Display bean = context.getBean(Display.class);
    Calculator bean2 = context.getBean(Calculator.class);

    @Test
    public void shouldDisplayCorrectMessageWithValue() {
        //given
        //when
        String output = bean.display(123.34);

        //then
        Assertions.assertEquals("The value: " + 123.34, output);
    }

    @Test
    public void shouldAddValues() {
        //given
        //when
        double output = bean2.add(2.5, 1.5);

        //then
        Assertions.assertEquals(4.0, output);
    }

    @Test
    public void shouldSubtractValues() {
        //given
        //when
        double output = bean2.subtract(2.5, 1.5);

        //then
        Assertions.assertEquals(1.0, output);
    }

    @Test
    public void shouldMultiplyValues() {
        //given
        //when
        double output = bean2.multiply(1.2, 1.2);

        //then
        Assertions.assertEquals(1.44, output);
    }

    @Test
    public void shouldDivideValues() {
        //given
        //when
        double output = bean2.divide(4.4, 1.1);

        //then
        Assertions.assertEquals(4.0, output);
    }

    @Test
    public void shouldReturnZeroWhenDivideByZero() {
        //given
        //when
        double output = bean2.divide(4.4, 0.0);

        //then
        Assertions.assertEquals(0.0, output);
    }
}
