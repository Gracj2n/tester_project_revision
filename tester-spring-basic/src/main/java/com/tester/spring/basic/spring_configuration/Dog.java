package com.tester.spring.basic.spring_configuration;

import org.springframework.stereotype.Component;

public class Dog implements Animal{
    @Override
    public String getVoice() {
        return "Bark bark";
    }
}
