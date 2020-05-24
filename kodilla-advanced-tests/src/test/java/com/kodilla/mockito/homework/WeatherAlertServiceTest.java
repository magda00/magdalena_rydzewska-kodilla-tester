package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class WeatherAlertServiceTest {
    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Person person = Mockito.mock(Person.class);
    Localization localization = Mockito.mock(Localization.class);
    Alert alert = Mockito.mock(Alert.class);

    Person firstPerson = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Person thirdPerson = Mockito.mock(Person.class);
    Localization firstLocalization = Mockito.mock(Localization.class);
    Localization secondLocalization = Mockito.mock(Localization.class);
    Localization thirdLocalization = Mockito.mock(Localization.class);

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
    public void unsubscribedPersonShouldNotReceiveAlert() {
        //given
        weatherAlertService.addPersonToLocalization(firstLocalization, firstPerson);
        weatherAlertService.addPersonToLocalization(firstLocalization, secondPerson);
        weatherAlertService.addPersonToLocalization(secondLocalization, firstPerson);

        //when
        weatherAlertService.removeSubscriber(firstPerson);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstPerson, Mockito.never()).receive(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSentToAllSubscribers() {
        //given
        weatherAlertService.addPersonToLocalization(firstLocalization, firstPerson);
        weatherAlertService.addPersonToLocalization(firstLocalization, secondPerson);
        weatherAlertService.addPersonToLocalization(secondLocalization, firstPerson);
        weatherAlertService.addPersonToLocalization(thirdLocalization, thirdPerson);

        //when
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receive(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(alert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(alert);
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

    @Test
    public void multiSubscribedPersonRemovedFromLocalizationShouldNotReceiveAlertFromThisLocalization() {
        //given
        weatherAlertService.addPersonToLocalization(firstLocalization, firstPerson);
        weatherAlertService.addPersonToLocalization(firstLocalization, secondPerson);
        weatherAlertService.addPersonToLocalization(secondLocalization, firstPerson);

        //when
        weatherAlertService.removeSubscribersFromSpecificLocalization(firstPerson, secondLocalization);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receive(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscribedPersonShouldNotReceiveAlertWhenLocalizationDeleted() {
        //given
        weatherAlertService.addPersonToLocalization(firstLocalization, firstPerson);
        weatherAlertService.addPersonToLocalization(firstLocalization, secondPerson);
        weatherAlertService.addPersonToLocalization(secondLocalization, firstPerson);

        //when
        weatherAlertService.deleteLocalization(secondLocalization);
        weatherAlertService.sendAlertToAllSubscriber(alert);

        //then
        Mockito.verify(firstPerson, Mockito.times(1)).receive(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(alert);
    }
}