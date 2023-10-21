package com.tester.optional;

import com.tester.stream.User;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        User user = new User("UserExampleName", 24, 1200, "ExampleGroup");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
        optionalUser.ifPresent(u -> System.out.println(u.getAge()));


    }
}
