package com.tester.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTest {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring");
    Car car = context.getBean(Car.class);

    @Test
    void shouldReturnCorrectCar() {
       assertEquals(car.getCarType(), "Sedan");
    }

    @Test
    void shouldTurnOnHeadlights() {
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}