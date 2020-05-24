package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getOrdersWithDateBetween(LocalDate minDate, LocalDate maxDate) {
        Set<Order> result = new HashSet<>();
        for (Order order : orders) {
            if (order.getDate().isAfter(minDate) && order.getDate().isBefore(maxDate)) {
                result.add(order);
            }
        }
        return result;
    }

    public Set<Order> getOrdersWithValueBetween(double minValue, double maxValue) {
        Set<Order> result = new HashSet<>();
        for (Order order : orders) {
            if (order.getValue() > minValue && order.getValue() < maxValue) {
                result.add(order);
            }
        }
        return result;
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getSumOfValues() {
        double sum = 0;
        for (Order order : orders) {
            sum += order.getValue();
        }
        return sum;
    }

    public void clear() {
        orders.clear();
    }

}
