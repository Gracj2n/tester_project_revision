package com.tester.notebooks;

public class Notebook {
    int price;
    int weight;
    int year;

    public Notebook(int price, int weight, int yearOfProduction) {
        this.weight = weight;
        this.price = price;
        this.year = yearOfProduction;
    }

    public int checkPrice() {
        if (price < 1500) {
            System.out.println("This notebook is very cheap.");
        } else if (price > 3500) {
            System.out.println("This notebook is very expensive.");
        } else {
            System.out.println("This notebook is in average price.");
        }
        return price;
    }

    public int checkWeight() {
        if (weight < 600) {
            System.out.println("This notebook is very light.");
        } else if (weight > 1000) {
            System.out.println("This notebook is very heavy.");
        } else {
            System.out.println("This notebook is in medium weight");
        }
        return weight;
    }

    public int checkYear() {
        if (year < 2015) {
            System.out.println("This notebook is very old.");
        } else if (year > 2022) {
            System.out.println("This notebook is brand new.");
        } else {
            System.out.println("This notebook is not that old.");
        }
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }
}
