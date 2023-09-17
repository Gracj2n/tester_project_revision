package com.tester.collections.advanced.maps.complex;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {

    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        Student john = new Student("John", "Bravo");
        Student michael = new Student("Michale", "Porkchop");
        Student jessica = new Student("Jessica", "Greenman");

        Grades johnGrades = new Grades(Arrays.asList(3.0, 4.0, 5.0, 4.5, 3.5));
        Grades michaelGrades = new Grades(Arrays.asList(4.0, 4.0, 5.0, 2.5, 4.5));
        Grades jessicaGrades = new Grades(Arrays.asList(5.0, 3.5, 4.0, 3.5, 5.0));

        school.put(john, johnGrades);
        school.put(michael, michaelGrades);
        school.put(jessica, jessicaGrades);

        for (Map.Entry<Student, Grades> record : school.entrySet()) {
            System.out.println(record + " AVG: " + record.getValue().getAverageOfGrades());
        }
    }
}
