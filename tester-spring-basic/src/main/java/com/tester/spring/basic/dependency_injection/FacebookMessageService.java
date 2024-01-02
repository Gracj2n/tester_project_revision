package com.tester.spring.basic.dependency_injection;

public class FacebookMessageService implements MessageService {

    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending facebook message [" + message + "] to: " + receiver);
    }
}
