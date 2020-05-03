package com.kodilla.exception.homework;

import org.junit.Test;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void testIfOrderExist_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order ifOrderExist = Warehouse.getOrder("000ORDER");
    }
}