package com.tester.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    Invoice invoice = new Invoice();
    Item item1 = new Item("Sofa", 1200);
    Item item2 = new Item("Desk", 450);
    Item item3 = new Item("Table", 280);

    @BeforeEach
    void setup() {
        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);
    }

    @Test
    void shouldAddItemToInvoice() {
        assertEquals(3, invoice.getSize());
    }

    @Test
    void shouldReturnCorrectPrice() {
        assertEquals(1200, invoice.getItem(0).getPrice());
    }

    @Test
    void shouldReturnCorrectName() {
        assertEquals("Desk", invoice.getItem(1).getName());
    }

    @ParameterizedTest
    @CsvSource(value = {"-1", "5"})
    void shouldReturnNullWhenChooseIndexOutOfListSize(int index) {
        assertNull(invoice.getItem(index));
    }

    @Test
    void shouldReturnZeroSizeWhenClearInvoice() {
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
    }
}