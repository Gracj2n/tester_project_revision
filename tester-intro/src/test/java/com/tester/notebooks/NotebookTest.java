package com.tester.notebooks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {
    Notebook notebook = new Notebook(3500, 300, 2015);
    Notebook heavyNotebook = new Notebook(2800, 1200, 2008);
    Notebook officeNotebook = new Notebook(5000, 700, 2023);

    @Test
    void notebook() {
        System.out.println("Notebook info: " + notebook.price + " " + notebook.weight);
        System.out.println("Heavy Notebook info: " + heavyNotebook.price + " " + heavyNotebook.weight);
        System.out.println("Office Notebook info: " + officeNotebook.price + " " + officeNotebook.weight);
    }

    @Test
    void checkingPriceMethodTest() {
        int expectedPrice = 3500;
        assertEquals(notebook.checkPrice(), expectedPrice);
    }

    @Test
    void checkingWeightMethodTest() {
        int expectedWeight = 1200;
        assertEquals(heavyNotebook.checkWeight(), expectedWeight);
    }

    @Test
    void checkingYearMethodTest() {
        int expectedYear = 2023;
        assertEquals(officeNotebook.checkYear(), expectedYear);
    }
}