package com.tester.exception.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    //given
    Warehouse warehouse = new Warehouse();

    @BeforeEach
    void setup() {
        //given
        warehouse.addOrder(new Order("1.01/02/2024"));
        warehouse.addOrder(new Order("1.02/02/2024"));
        warehouse.addOrder(new Order("2.02/02/2024"));
    }

    @Test
    void returnExistOrder() throws OrderDoesntExistException {
        //when
        int actual = warehouse.getOrder("1.01/02/2024").size();
        //then
        assertEquals(1, actual);
    }

    @Test
    void returnNonExistOrder_throwException() {
        //then                                              //when
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("1.01/02/2025"));
    }
}