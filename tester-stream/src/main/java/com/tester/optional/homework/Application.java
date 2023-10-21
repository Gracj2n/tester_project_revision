package com.tester.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Teacher max = new Teacher("Dr. Max");
        Teacher colin = new Teacher("Dr. Colin");
        Teacher peppa = new Teacher("Dr. Peppa");

        Student michael = new Student("Michael", max);
        Student dave = new Student("Dave", colin);
        Student joe = new Student("Joe", null);
        Student piggy = new Student("Piggy", peppa);
        Student tristiana = new Student("Tristiana", null);

        List<Student> studentList = new ArrayList<>();
        studentList.add(michael);
        studentList.add(dave);
        studentList.add(joe);
        studentList.add(piggy);
        studentList.add(tristiana);

        for (Student student : studentList) {
            Optional<String> optional = Optional.ofNullable(student.getTeacher().getName());
            String teacherString = optional.orElse("<undefined>");

            System.out.println("Student: " + student.getName());
            System.out.println(teacherString);
        }
    }
}
