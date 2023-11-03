package com.tester.stream.homework;

import com.tester.stream.User;
import com.tester.stream.UserRepository;

import java.util.List;

public class ForumStats {
    public double avgOverAge(int age, List<User> userList) {
        double avg = userList
                .stream()
                .filter(n -> n.getAge() >= age)
                .mapToInt(n -> n.getNumberOfPosts())
                .average()
                .getAsDouble();
        return avg;
    }

    public double avgUnderAge(int age, List<User> userList) {
        double avg = userList
                .stream()
                .filter(n -> n.getAge() <= age)
                .mapToInt(n -> n.getNumberOfPosts())
                .average()
                .getAsDouble();
        return avg;
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        System.out.println(forumStats.avgOverAge(40,UserRepository.getUserList()));
        System.out.println(forumStats.avgUnderAge(40, UserRepository.getUserList()));
    }
}
