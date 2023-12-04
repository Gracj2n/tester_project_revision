package com.tester.execution_model.homework;

import java.time.Instant;

public class Order {

    private double price;
    private Instant date;
    private String login;

    public Order(double price, Instant date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public double getPrice() {
        return price;
    }

    public Instant getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }
}
