package com.tester.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John Max 36";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastname: " + nameParts[1]);
        System.out.println("Age: " + nameParts[2]);
    }
}
