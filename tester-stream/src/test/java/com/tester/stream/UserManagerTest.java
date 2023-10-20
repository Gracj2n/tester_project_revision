package com.tester.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @Test
    void shouldReturnCorrectUsername() {
        //given
        //when
        List<String> actualNames = UserManager.filterChemistGroupUsernames();
        //then
        List<String> expectedNames = new ArrayList<>();
        expectedNames.add(new String("Walter White"));
        expectedNames.add(new String("Gale Boetticher"));
        assertEquals(expectedNames, actualNames);
    }

    @Test
    void shouldReturnUsersOlderThan45() {
        //given
        //when
        List<User> actualUserList = UserManager.filterUsersOlderThan(45);
        //then
        assertEquals(3, actualUserList.size());
    }

    @Test
    void shouldReturnUsersYoungerThan45() {
        //given
        //when
        List<User> actualUserList = UserManager.filterUsersYoungerThan(45);
        //then
        assertEquals(3, actualUserList.size());
    }
}