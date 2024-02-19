package com.tester.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CarConfiguration {

    @Bean
    public Car selectCar() {
        Car car;

        LocalDate actualDate = LocalDate.now();

        if (actualDate.getMonth().equals(Month.JUNE)) {
            car = new Cabrio();
        } else if (actualDate.getMonth().equals(Month.MARCH)) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
