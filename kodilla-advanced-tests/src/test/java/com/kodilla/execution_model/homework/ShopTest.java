package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();

    Order order1 = new Order(5.50, LocalDate.of(2020, 6, 15), "0Maggie013");
    Order order2 = new Order(45.25, LocalDate.of(2020, 3, 20), "Suzie");
    Order order3 = new Order(17.33, LocalDate.of(2020, 1, 3), "Mike102");

    @BeforeEach
    public void addOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrderToShop() {
        //Given
        Order order4 = new Order(12.50, LocalDate.of(2019, 6, 25), "0Maggie013");
        //When
        shop.addOrder(order4);
        //Then
        assertEquals(4, shop.getNumberOfOrders());
    }

    @Test
    void shouldGetEmptySetWhenDatesIsOutOfRange() {
        //Given @BeforeEach addOrders
        //When
        Set<Order> result = shop.getOrdersWithDateBetween(LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 31));
        boolean emptySet = result.isEmpty();
        //Then
        assertTrue(emptySet);
    }

    @Test
    void shouldGetOrdersWithDateBetween() {
        //Given @BeforeEach addOrders
        //When
        Set<Order> result = shop.getOrdersWithDateBetween(LocalDate.of(2020, 3, 1), LocalDate.of(2020, 3, 31));
        //Then
        assertEquals(1, result.size());
    }

    @Test
    void shouldGetOrdersWithValueBetween() {
        //Given @BeforeEach addOrders
        //When
        Set<Order> result = shop.getOrdersWithValueBetween(10.0, 50.0);
        //Then
        assertEquals(2, result.size());
    }

    @Test
    void shouldGetEmptySetWhenValuesIsOutOfRange() {
        //Given @BeforeEach addOrders
        //When
        Set<Order> result = shop.getOrdersWithValueBetween(50.0, 150.00);
        boolean emptySet = result.isEmpty();
        //Then
        assertTrue(emptySet);
    }

    @Test
    void shouldGetZeroWhenSetIsEmpty() {
        //Given @BeforeEach addOrders
        shop.clear();
        //When
        int size = shop.getNumberOfOrders();
        //Then
        assertEquals(0, size);
    }

    @Test
    void shouldGetNumberOfOrders() {
        //Given @BeforeEach addOrders
        //When
        int size = shop.getNumberOfOrders();
        //Then
        assertEquals(3, size);
    }

    @Test
    void shouldGetSumOfValues() {
        //Given @BeforeEach addOrders
        //When
        double sum = shop.getSumOfValues();
        //Then
        assertEquals(68.08, sum);
    }
}