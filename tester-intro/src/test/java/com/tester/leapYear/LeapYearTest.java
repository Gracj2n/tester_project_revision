package com.tester.leapYear;

import com.tester.leapYear.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    LeapYear leapYear = new LeapYear();

    @Test
    void is2024LeapYear() {
        assertTrue(leapYear.isLeapYear(2024));
    }

    @Test
    void is1999LeapYear() {
        assertFalse(leapYear.isLeapYear(1999));
    }
}