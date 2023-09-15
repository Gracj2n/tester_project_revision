package com.tester.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {

    public static void main(String[] args) {
        Set<Order> orderSet = new HashSet<>();
        orderSet.add(new Order("1", "Water", 20));
        orderSet.add(new Order("2", "Desk", 2));
        orderSet.add(new Order("3", "Box", 10));

        for (Order order : orderSet) {
            System.out.println(order);
        }
    }
}
