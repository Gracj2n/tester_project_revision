package com.tester.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SimpleApplicationTest {

    @Test
    void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.send("Test message", "Test receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
}