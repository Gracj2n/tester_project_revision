package com.tester.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleApplicationTest {

    @Test
    void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.send("Test Message", "TestReceiver");
        assertNotNull(message);
    }

    @Test
    void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test message.", "Test receiver");
        assertEquals("Sending [Test message.] to: Test receiver using Skype", message);
    }
}