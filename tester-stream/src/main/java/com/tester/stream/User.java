package com.tester.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String username, int age, int numberOfPosts, String group) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be under 0");
        }
        this.username = username;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && numberOfPosts == user.numberOfPosts && Objects.equals(username, user.username) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPosts, group);
    }
}
