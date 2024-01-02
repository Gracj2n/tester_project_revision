package com.tester.spring.dependency_injection;

public class EmailMessageService implements MessageService{
    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending e-mail [" + message + "] to: " + receiver);
    }
}
