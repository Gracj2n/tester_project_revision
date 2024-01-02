package com.tester.spring.dependency_injection.homework;

public class InpostDeliveryService implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering by Inpost in progress...");
        return true;
    }
}
