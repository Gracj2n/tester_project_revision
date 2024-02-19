package com.tester.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTest {

    @Test
    void shouldCreateDifferentClocks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");

        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);

        assertNotEquals(clock1, clock2);
        assertNotEquals(clock1, clock3);
        assertNotEquals(clock2, clock3);
    }
}