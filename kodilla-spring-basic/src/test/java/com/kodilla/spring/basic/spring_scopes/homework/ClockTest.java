package com.kodilla.spring.basic.spring_scopes.homework;


import com.kodilla.spring.basic.spring_scopes.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClockTest {

    @Test
    public void shouldCreateDifferentBeanWithTime() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);

        //when
        LocalTime time1 = firstBean.getTime();
        LocalTime time2 = secondBean.getTime();
        LocalTime time3 = thirdBean.getTime();

        //then
        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time1, time3);
        Assertions.assertNotEquals(time2, time3);
    }
}