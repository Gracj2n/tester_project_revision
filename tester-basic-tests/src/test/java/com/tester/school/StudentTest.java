package com.tester.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void shouldCalculateCorrectAveragesIfGradesAreInRange() {
        Student student = new Student("Martin");

        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addMathGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4, geographyAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(3, physicsAverage, 0.01);
    }

    @Test
    void shouldCalculateAnAverageOffAllGrades() {
        Student student = new Student("Dave");

        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(3);

        student.addPhysicsGrade(5);
        student.addPhysicsGrade(5);

        student.addHistoryGrade(4);
        student.addHistoryGrade(3);

        student.addMathGrade(0);

        assertEquals(3.04, student.getAverageOfAllGrades(), 0.1);
    }
}