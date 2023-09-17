package com.tester.collections.advanced.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {

    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Geography", 4.0);
        grades.put("Physics", 4.5);
        grades.put("History", 3.0);

        System.out.println(grades.get("Mathematics"));

        for (Map.Entry<String, Double> mapRecord : grades.entrySet()) {
            System.out.println(mapRecord);
        }
    }
}
