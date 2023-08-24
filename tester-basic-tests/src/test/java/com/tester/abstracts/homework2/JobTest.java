package com.tester.abstracts.homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @Test
    void jobTest() {

        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper(10000);
        JavaDeveloper javaDeveloper = new JavaDeveloper(1500);
        QualityAssuranceTester qualityAssuranceTester = new QualityAssuranceTester(8000);

        Person michal = new Person("Michał", 27, frontEndDeveloper);
        Person karolina = new Person("Karolina", 25, javaDeveloper);
        Person dawid = new Person("Dawid", 30, qualityAssuranceTester);

        michal.displayResponsibilities();
        karolina.displayResponsibilities();
        dawid.displayResponsibilities();

        System.out.println("Java developer salary: " + javaDeveloper.getSalary());
    }
}