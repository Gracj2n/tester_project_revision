package com.tester.optional;

import com.tester.stream.User;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        User user = new User("Jackson", 25, 1200, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);
    }
}
