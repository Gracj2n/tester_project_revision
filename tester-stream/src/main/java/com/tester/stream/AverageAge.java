package com.tester.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUserList()
                .stream()
                .mapToInt(u -> u.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
