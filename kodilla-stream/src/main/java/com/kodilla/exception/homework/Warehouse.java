package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    static Set<Order> orders = new HashSet<>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new);
    }

}
