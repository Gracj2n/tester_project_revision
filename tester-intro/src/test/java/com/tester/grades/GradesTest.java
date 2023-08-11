package com.tester.grades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {
    Grades gradesTable = new Grades(4);

    @BeforeEach
    void setup() {
        gradesTable.add(4);
        gradesTable.add(2);
        gradesTable.add(5);
        gradesTable.add(3);
    }

    @Test
    void add() {
        assertEquals(4, gradesTable.getGradesTable().length);
    }

    @Test
    void returnLastAddedGrade() {
        assertEquals(3, gradesTable.returnLastAddedGrade());
    }

    @Test
    void averageOfGrades() {
        assertEquals(3.5,gradesTable.averageOfGrades());
    }
}