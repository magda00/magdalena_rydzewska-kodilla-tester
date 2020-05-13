package com.kodilla.execution_model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice = new Invoice();
    Item one = new Item("one", 123.45);
    Item two = new Item("two", 50.34);
    Item tree = new Item("tree", 0.34);
    Item four = new Item("four", 25.00);
    Item five = new Item("five", 16.90);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(one);
        invoice.addItem(two);
        invoice.addItem(tree);
        invoice.addItem(four);
        invoice.addItem(five);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing...");
    }

    @Test
    public void shouldAddFiveItems() {

        assertEquals(5, invoice.getSize());
    }

    @Test
    public void shouldGetSecondItem() {

        Item result = invoice.getItem(1);
        assertEquals("two", result.getName());
        assertEquals(50.34, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenGetNegativeIndex() {

        assertNull(invoice.getItem(-1));
    }

    @Test
    public void shouldReturnNullWhenGetIndexOutOfList() {

        assertNull(invoice.getItem(19));
    }

    @Test
    public void shouldReturnZeroSizeAfterClear() {
        //When
        invoice.clear();
        //Then
        assertEquals(0, invoice.getSize());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}