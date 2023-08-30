package com.tester.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {

    Grades grades = new Grades();

    @Test
    void shouldHaveZeroLength() {
        int[] result = grades.getGrades();
        assertEquals(0, result.length);
    }

    @Test
    void shouldAddTwoElementsToGradesTable() {
        grades.add(4);
        grades.add(3);

        int[] gradesTable = grades.getGrades();

        assertEquals(4, gradesTable[0]);
        assertEquals(3, gradesTable[1]);

        assertEquals(2, gradesTable.length);
    }

    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }
}