package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private Map<Localization, Set<Person>> subscriptionMap = new HashMap<>();
    private Set<Person> subscribers = new HashSet<>();

    public void addPersonToLocalization(Localization localization, Person person) {
        subscribers.add(person);
        subscriptionMap.put(localization, subscribers);
    }

    public void sendAlertToAllSubscriber(Alert alert) {
        subscribers.forEach(person -> person.receive(alert));
    }

    public void sendAlertToSubscribersInSpecificLocalization(Localization localization, Alert alert) {
        subscriptionMap.forEach((specific, subscribers) -> {
            if (specific == localization) {
                subscribers.forEach(person -> person.receive(alert));
            }
        });
    }

    public void removeSubscribersFromSpecificLocalization(Person person, Localization localization) {
        if (subscriptionMap.containsKey(localization)) {
            subscriptionMap.remove(person);
        }
    }

    public void removeSubscriber(Person person) {
        for (Map.Entry<Localization, Set<Person>> subscriptionEntry : subscriptionMap.entrySet()) {
            subscriptionEntry.getValue().remove(person);
        }
    }

    public void deleteLocalization(Localization localization) {
        subscriptionMap.remove(localization);
    }
}
