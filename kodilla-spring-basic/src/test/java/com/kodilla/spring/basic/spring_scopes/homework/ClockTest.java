package com.kodilla.spring.basic.spring_scopes.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;


@SpringBootTest
public class ClockTest {

    @Test
    public void shouldCreateDifferentBeanWithTime() throws Exception {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);

        //when
        LocalTime time1 = firstBean.getTime();
        TimeUnit.NANOSECONDS.sleep(1);
        LocalTime time2 = secondBean.getTime();
        TimeUnit.NANOSECONDS.sleep(1);
        LocalTime time3 = thirdBean.getTime();

        //then
        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time1, time3);
        Assertions.assertNotEquals(time2, time3);
    }
}