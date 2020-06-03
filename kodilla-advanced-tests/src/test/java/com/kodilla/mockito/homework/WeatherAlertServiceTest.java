package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class WeatherAlertServiceTest {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Person person = Mockito.spy(new Person("SamePerson"));

    Localization localization = new Localization("aaa");
    Alert alert = Mockito.mock(Alert.class);

    Person firstPerson = Mockito.spy(new Person("John"));
    Person secondPerson = Mockito.spy(new Person("Bob"));
    Person thirdPerson = Mockito.spy(new Person("Steve"));

    Localization firstLocalization = new Localization("bbb");
    Localization secondLocalization = new Localization("ccc");
    Localization thirdLocalization = new Localization("ddd");

    @Test
    public void subscriberShouldReceiveAlert() {
        //given
        weatherAlertService.addPersonToLocalization(localization, person);

        //when
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
    }

    @Test
    public void notSubscribedPersonShouldNotReceiveAlert() {
        //given
        //when
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    public void alertShouldBeSentToSubscribersFromSpecificLocalization() {
        //given
        weatherAlertService.addPersonToLocalization(firstLocalization, firstPerson);
        weatherAlertService.addPersonToLocalization(firstLocalization, secondPerson);
        weatherAlertService.addPersonToLocalization(secondLocalization, firstPerson);

        //when
        weatherAlertService.sendAlertToSubscribersInSpecificLocalization(firstLocalization, alert);

        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receive(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(alert);
    }
}