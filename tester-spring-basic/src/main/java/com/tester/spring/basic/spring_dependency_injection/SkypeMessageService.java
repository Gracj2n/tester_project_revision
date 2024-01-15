package com.tester.spring.basic.spring_dependency_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SkypeMessageService implements MessageService{

    @Override
    public String send(String message, String receiver) {
        return "Sending [" +message+ "] to:" + receiver + " using Skype.";
    }
}
