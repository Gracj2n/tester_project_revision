package com.tester.spring.basic.dependency_injection.homework;

public class FedexDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 15) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering by FEDEX in progress...");
        return true;
    }
}
