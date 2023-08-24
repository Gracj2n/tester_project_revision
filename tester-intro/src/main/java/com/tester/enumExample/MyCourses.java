package com.tester.enumExample;

public class MyCourses {
    public static void main(String[] args) {
        Courses courses = Courses.TA;

        switch (courses) {
            case JD -> System.out.println("Java Developer");
            case JDP -> System.out.println("Java Developer Plus");
            case TA -> System.out.println("Tester Automation");
            case TM -> System.out.println("Tester Manual");
        }
    }
}
