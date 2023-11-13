package com.tester.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));

        try {
            System.out.println("Order number: " + warehouse.getOrder("1") + " exist!");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesnt exist");
        }

        try {
            System.out.println("Order number: " + warehouse.getOrder("6") + " exist!");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesnt exist");
        }
    }
}
