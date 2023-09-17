package com.tester.collections.advanced.maps.complex.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        //Tworzenie dyrektorów
        Principal johnWatson = new Principal("John Watson");
        Principal madelinDave = new Principal("Madelin Dave");
        Principal robieCage = new Principal("Robie Cage");

        //Tworzenie szkół
        School universityOfApple = new School("University of Apple", Arrays.asList(25, 21, 23, 24, 19));
        School universityOfTomato = new School("University of Tomato", Arrays.asList(31, 26, 22, 23));
        School universityOfBanana = new School("University of Banana", Arrays.asList(20, 18, 23));

        //Przypisanie dyrektorów do szkół
        Map<Principal, School> schoolMap = new HashMap();
        schoolMap.put(johnWatson, universityOfApple);
        schoolMap.put(madelinDave, universityOfTomato);
        schoolMap.put(robieCage, universityOfBanana);

        for (Map.Entry<Principal, School> record : schoolMap.entrySet()) {
            System.out.println(record);
            System.out.println("Sum of students: " + record.getValue().sumOfStudents());
        }
    }
}