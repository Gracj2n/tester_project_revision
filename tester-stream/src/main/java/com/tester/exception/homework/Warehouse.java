package com.tester.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    public List<Order> getOrder(String number) throws OrderDoesntExistException {
        List<Order> filteredByNumberOrderList = orderList.stream()
                .filter(n->n.getNumber().equals(number))
                .collect(Collectors.toList());
        if (filteredByNumberOrderList.size() == 0) {
            throw new OrderDoesntExistException();
        }
        return filteredByNumberOrderList;
    }
}
