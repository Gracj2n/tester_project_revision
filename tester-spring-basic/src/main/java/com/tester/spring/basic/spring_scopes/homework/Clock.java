package com.tester.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        System.out.println("Aktualna godzina: " + LocalTime.now());
    }
}
