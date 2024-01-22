package com.tester.spring.basic.spring_dependency_injection.homework2;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {

    public boolean deliveryPackage(String address, double weight) {
        return !(weight > 30);
    }
}
