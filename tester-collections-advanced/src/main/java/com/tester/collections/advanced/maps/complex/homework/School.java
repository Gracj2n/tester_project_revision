package com.tester.collections.advanced.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;
    private List<Integer> studentsNumberInClass = new ArrayList<>();

    public School(String schoolName, List<Integer> studentsNumberInClass) {
        this.schoolName = schoolName;
        this.studentsNumberInClass = studentsNumberInClass;
    }

    public int sumOfStudents() {
        int sum = 0;
        for (Integer students : studentsNumberInClass) {
            sum += students;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsNumberInClass=" + studentsNumberInClass +
                '}';
    }
}
