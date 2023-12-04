package com.tester.execution_model.homework;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> ordersSet = new HashSet<>();

    public void addOrder(Order order) {
        ordersSet.add(order);
    }

    public Set<Order> ordersFromDateToDate(Instant minDate, Instant maxDate) {
        return ordersSet
                .stream()
                .filter(order -> order.getDate().isAfter(minDate))
                .filter(order -> order.getDate().isBefore(maxDate))
                .collect(Collectors.toSet());
    }

    public Set<Order> ordersFromPriceToPrice(double minPrice, double maxPrice) {
        return ordersSet
                .stream()
                .filter(order -> order.getPrice() > minPrice)
                .filter(order -> order.getPrice() < maxPrice)
                .collect(Collectors.toSet());
    }

    public int numberOfOrders() {
        return ordersSet.size();
    }

    public double sumValuesOfAllOrders() {
        return ordersSet
                .stream()
                .mapToDouble(n -> n.getPrice())
                .sum();
    }

}
