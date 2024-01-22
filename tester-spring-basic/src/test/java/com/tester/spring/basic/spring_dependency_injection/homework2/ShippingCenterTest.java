package com.tester.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTest {

    private ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");
    private ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    void shouldSendPackage() {
        String actual = bean.sendPackage("Kondratowicza 59", 5);
        assertEquals("Package delivered to: Kondratowicza 59", actual);
    }

    @Test
    void shouldNotSendPackage() {
        String actual = bean.sendPackage("Kondratowicza 59", 55);
        assertEquals("Package not delivered to: Kondratowicza 59", actual);
    }
}