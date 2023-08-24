package com.tester.abstracts.homework2;

public abstract class Job {

    private int salary;
    private String responsibilites;

    public Job(int salary, String responsibilites) {
        this.salary = salary;
        this.responsibilites = responsibilites;
    }

    public int getSalary() {
        return salary;
    }

    public String getResponsibilites() {
        return responsibilites;
    }
}
