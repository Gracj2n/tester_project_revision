package com.tester.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void classUserTests() {

        User example1 = new User("Jan", 29);
        User example2 = new User("Anna", 50);
        User example3 = new User("Krzysiek", 18);

        User[] usersTable = {example1, example2, example3};

        int result = 0; //suma wieku
        for (User value : usersTable) {
            result = result + value.getAge();
        }

        int averageOfAge = result / usersTable.length; //średnia wieku
        System.out.println("Average age: " + averageOfAge);

        System.out.println("User with age under average age: ");
        for (User user : usersTable) {
            if (user.getAge() < averageOfAge) {
                System.out.println("-" + user.getName());
            }
        }
    }
}