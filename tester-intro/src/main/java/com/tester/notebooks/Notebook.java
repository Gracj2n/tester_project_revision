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
        return getPrice();
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
