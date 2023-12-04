package com.tester.execution_model.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(1200, Instant.parse("2015-11-01T00:00:00.00Z"), "DaveGi");
    Order order2 = new Order(2400, Instant.parse("2016-06-23T00:00:00.00Z"), "DaveGi");
    Order order3 = new Order(3300, Instant.parse("2017-08-22T00:00:00.00Z"), "NikaLo");
    Order order4 = new Order(5430, Instant.parse("2018-02-18T00:00:00.00Z"), "NikaLo");
    Order order5 = new Order(9940, Instant.parse("2018-04-30T00:00:00.00Z"), "ChicPe");
    Order order6 = new Order(1230, Instant.parse("2019-09-16T00:00:00.00Z"), "ChicPe");
    Order order7 = new Order(1780, Instant.parse("2020-03-11T00:00:00.00Z"), "MonaLi");
    Order order8 = new Order(7040, Instant.parse("2022-01-25T00:00:00.00Z"), "MonaLi");
    Order order9 = new Order(4450, Instant.parse("2023-10-11T00:00:00.00Z"), "KatrinSo");
    Order order10 = new Order(12050, Instant.parse("2023-12-01T00:00:00.00Z"), "KatrinSo");

    @BeforeEach
    void setup() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        shop.addOrder(order8);
        shop.addOrder(order9);
        shop.addOrder(order10);
    }

    @Test
    void shouldAddOrder() {
        assertEquals(10, shop.numberOfOrders());
    }

    @ParameterizedTest
    @MethodSource(value = "com.tester.execution_model.homework.OrderSources#provideDatesForTesting")
    void shouldReturnOrdersSetFromDateToDate(Instant inputMinDate, Instant inputMaxDate, int expectedSize) {
        int actualSizeOfSet = shop.ordersFromDateToDate(inputMinDate, inputMaxDate).size();
        assertEquals(expectedSize, actualSizeOfSet);
    }

    @ParameterizedTest
    @MethodSource(value = "com.tester.execution_model.homework.OrderSources#providePricesForTesting")
    void shouldReturnOrdersSetFromPriceToPrice(double inputMinPrice, double inputMaxPrice, int expectedSize) {
        int actualSizeOfSearchingSet = shop.ordersFromPriceToPrice(inputMinPrice, inputMaxPrice).size();
        assertEquals(expectedSize, actualSizeOfSearchingSet);
    }

    @Test
    void shouldSumValuesOfAllOrders() {
        double actualValues = shop.sumValuesOfAllOrders();
        assertEquals(48820, actualValues);
    }

}