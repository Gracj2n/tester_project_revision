package com.tester.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stampsSet = new HashSet<>();

        stampsSet.add(new Stamp("London", "10x10", true));
        stampsSet.add(new Stamp("London", "10x10", true)); //duplikat
        stampsSet.add(new Stamp("Warsaw", "10x12", true));
        stampsSet.add(new Stamp("Paris", "12x14", true));

        System.out.println("Rozmiar kolekcji: " + stampsSet.size());

        for (Stamp stamp : stampsSet) {
            System.out.println(stamp);
        }
    }
}
