package com.tester.stream.homework;

import com.tester.stream.User;
import com.tester.stream.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    List<User> testUsers = new ArrayList<>();
    ForumStats forumStats = new ForumStats();

    @BeforeEach
    public void setup() {
        testUsers.add(new User("Michael", 24, 120, "Group no. 1"));
        testUsers.add(new User("Jake", 27, 4000, "Group no. 1"));
        testUsers.add(new User("Alexa", 32, 760, "Group no. 1"));
        testUsers.add(new User("Mona", 54, 2430, "Group no. 1"));
        testUsers.add(new User("Trevor", 35, 115, "Group no. 1"));
    }

    @Test
    void avgOver35Age() {
        //when
        double actual = forumStats.avgOverAge(35, testUsers);
        double expected = 1272.5;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void avgOver54Age() {
        //when
        double actual = forumStats.avgOverAge(54, testUsers);
        double expected = 2430;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void avgUnder35Age() {
        //when
        double actual = forumStats.avgUnderAge(35, testUsers);
        double expected = 1248.75;
        //then
        assertEquals(expected, actual);
    }

    @Test
    void avgUnder24Age() {
        //when
        double actual = forumStats.avgUnderAge(24, testUsers);
        double expected = 120;
        //then
        assertEquals(expected, actual);
    }
}