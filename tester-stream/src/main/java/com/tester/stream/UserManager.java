package com.tester.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserManager {

    public static void main(String[] args) {
        System.out.println(filterChemistGroupUsernames());
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<User> filterUsersOlderThan(int age) {

        return UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < age)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersYoungerThan(int age) {

        return UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < age)
                .collect(Collectors.toList());
    }
}
