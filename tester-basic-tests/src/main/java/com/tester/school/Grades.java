package com.tester.school;

public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.size = 0;
        this.grades = new int[0];
    }

    public void add(int grade) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(grades, 0, newTab, 0, grades.length);
        newTab[this.size - 1] = grade;
        this.grades = newTab;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getAverage() {
        if (this.grades.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }
        return sum/this.grades.length;
    }
}
