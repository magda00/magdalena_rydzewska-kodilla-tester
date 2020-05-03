package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("001ORDER"));
        Warehouse.addOrder(new Order("002ORDER"));
        Warehouse.addOrder(new Order("003ORDER"));
        Warehouse.addOrder(new Order("004ORDER"));

        try {
            Warehouse.getOrder("000ORDER");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order doesn't exist.");
        }
    }
}
