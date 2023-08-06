package com.tester.tables;

public class SimpleArray {
    public static void main(String[] args) {

        String[] movies = new String[3];
        movies[0] = "Harry Potter";
        movies[1] = "Transformers";
        movies[2] = "Fast and Furious";

        String movie = movies[0];
        System.out.println(movie);
        System.out.println();

        System.out.println("For:");
        for (int n = 0; n < movies.length; n++) {
            System.out.println(movies[n]);
        }
        System.out.println();

        System.out.println("While:");
        int m = 0;
        while (m < movies.length) {
            System.out.println(movies[m]);
            m++;
        }
    }
}
