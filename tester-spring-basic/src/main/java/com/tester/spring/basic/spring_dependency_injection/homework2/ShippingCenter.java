package com.tester.spring.basic.spring_dependency_injection.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private DeliveryService deliveryService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliveryPackage(address, weight)) {
            return notificationService.success(address);
        } else {
            return notificationService.fail(address);
        }
    }
}
