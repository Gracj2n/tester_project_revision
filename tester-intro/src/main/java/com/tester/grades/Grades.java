package com.tester.grades;

public class Grades {
    int[] gradesTable;
    int size;

    public Grades(int gradesTableSize) {
        this.gradesTable = new int[gradesTableSize];
        this.size = 0;
    }

    public void add(int value) {
        if (gradesTable.length == 0 || gradesTable == null) {
            throw new IllegalArgumentException("Tablica nie może  być pusta!");
        }
        this.gradesTable[this.size] = value;
        this.size++;
    }

    public int returnLastAddedGrade() {
        return gradesTable[size -1];
    }

    public double averageOfGrades() {
        double suma = 0;
        for (int i : gradesTable) {
            suma = suma + i;
        }
        return suma / gradesTable.length;
    }

    public void showAllAddedGrades() {
        int suma = 0;
        for (int i = 0; i < gradesTable.length; i++) {
            suma = suma + i;
            System.out.println(gradesTable[i]);
        }
    }

    public int[] getGradesTable() {
        return gradesTable;
    }

    public int getSize() {
        return size;
    }
}
